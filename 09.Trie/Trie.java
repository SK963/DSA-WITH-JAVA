class Trie 
{
    class TrieNode {
        TrieNode[] childNode;
        boolean wordEnd;
        int wordCount;
    
        TrieNode()
        {
            this.childNode = new TrieNode[26];
            this.wordEnd = false;
            this.wordCount = 0;
        }
    }
    
    TrieNode root;

    Trie() { root = new TrieNode(); }

    // Function to insert a key into the Trie
    public void insert(String word)
    {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (currentNode.childNode[index] == null) {
                currentNode.childNode[index]
                    = new TrieNode();
            }
            currentNode = currentNode.childNode[index];
        }
        currentNode.wordEnd = true;
    }

    // Function to search for a key in the Trie
    public boolean search(String word)
    {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (currentNode.childNode[index] == null) {
                return false;
            }
            currentNode = currentNode.childNode[index];
        }
        return currentNode.wordEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode currentNode = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (currentNode.childNode[index] == null) {
                return false;
            }
            currentNode = currentNode.childNode[index];
        }
        return (currentNode.wordEnd || !currentNode.wordEnd);

        
    }

    public boolean deleteKey(String word) {
        TrieNode currentNode = root;
        TrieNode lastBranchNode = null;
        char lastBranchChar = 'a';

        for (char c : word.toCharArray()) {
            if (currentNode.childNode[c - 'a'] == null) {
                // If the current node has no child, the word is not present
                return false;
            } else {
                int count = 0;
                // Count the number of non-null child nodes
                for (int i = 0; i < 26; i++) {
                    if (currentNode.childNode[i] != null)
                        count++;
                }

                if (count > 1) {
                    // If there are more than one child, store the last branch information
                    lastBranchNode = currentNode;
                    lastBranchChar = c;
                }
                currentNode = currentNode.childNode[c - 'a'];
            }
        }

        int count = 0;
        // Count the number of non-null child nodes at the last character
        for (int i = 0; i < 26; i++) {
            if (currentNode.childNode[i] != null)
                count++;
        }

        // Case 1: The deleted word is a prefix of other words in Trie.
        if (count > 0) {
            // Decrement the word count and indicate successful deletion
            currentNode.wordCount--;
            return true;
        }

        // Case 2: The deleted word shares a common prefix with other words in Trie.
        if (lastBranchNode != null) {
            // Remove the link to the deleted word
            lastBranchNode.childNode[lastBranchChar - 'a'] = null;
            return true;
        }
        // Case 3: The deleted word does not share any common prefix with other words in Trie.
        else {
            // Remove the link to the deleted word from the root
            root.childNode[word.charAt(0) - 'a'] = null;
            return true;
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        String[] words = { "the" , "a" , "there" , "any" , "three" };
        // Insert each string into the Trie
        for (String str : words) {
            trie.insert(str);
        }

        String[] searchQueryStrings
            = { "a", "geek", "the" };
        // Search for each string and print whether it is
        // found in the Trie
        for (String query : searchQueryStrings) 
        {
            System.out.println("Query String: " + query);
            if (trie.search(query)){
                System.out.println("The query string \""+ query +"\" is present in the Trie");
            }
            else {
                System.out.println("The query string \""+ query +"\" is not present in the Trie");
            }
        }

        if(trie.deleteKey("a")){
            System.out.println("the word \"a\"  deleted successfully" );
        }
        else{
            System.out.println("the word \"a\" is not present");
        }
    }
}