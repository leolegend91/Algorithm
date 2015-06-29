package implementTrie;

class TrieNode {
	TrieNode child;
    TrieNode next;
    char c;
    boolean isWord;
	// Initialize your data structure here.
    public TrieNode() {
        
    }
    
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
    	if(search(word))return;
    	TrieNode pNode = root;
    	TrieNode cNode = pNode.child;
    	char cArray[] = word.toCharArray();
    	
    	int length = cArray.length;
    	for(int i=0;i<length;i++)
    	{
    		char c = cArray[i];
    		if(cNode==null)
        	{
        		pNode.child=new TrieNode();
        		cNode = pNode.child;
        		cNode.c=c;
        		
        		pNode = pNode.child;
        		cNode = pNode.child;
        	}
    		else
    		{
    			//遍历当前层，确定当前层的链表是否包含当前字符
    			while(cNode!=null && cNode.c != c)
    			{
    				cNode = cNode.next;
    			}
    			//子链表中不包含当前字符
    			if(cNode == null)
    			{
    				cNode = pNode.child;
    				pNode.child = new TrieNode();
    				pNode.child.c=c;
    				pNode.child.next=cNode;
    				pNode = pNode.child;
    				cNode = pNode.child;
    			}
    			//子链表中包含当前字符
    			else
    			{
    				pNode = cNode;
    				cNode = pNode.child;
    			}
    		}
    	}
    	pNode.isWord=true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
    	return (path(word)!=null && path(word).isWord);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if(path(prefix) != null)return true;
        else return false;
    }
    
    public TrieNode path(String word)
    {
    	
    	char cArray[] = word.toCharArray();
    	int length = cArray.length;
    	TrieNode pNode = root;
    	TrieNode cNode = pNode.child;
    	for(int i=0;i<length;i++)
    	{
    		char c = cArray[i];
    		if(cNode == null)return null;
    		else
    		{
    			while(cNode!=null && cNode.c!=c)
    			{
    				cNode = cNode.next;
    			}
    			if(cNode==null)
    			{
    				return null;
    			}
    			else
    			{
    				pNode = cNode;
    				cNode = cNode.child;
    			}
    		}
    	}
    	return pNode;
    }
    public static void main(String args[])
    {
    	Trie trie = new Trie();
    	//System.out.println(trie.search("a"));
    	
    	trie.insert("app");
    	trie.insert("apple");
    	trie.insert("beer");
    	trie.insert("add");
    	trie.insert("jam");
    	trie.insert("rental");
    	trie.search("apps");
    	System.out.println(trie.search("app"));
    	trie.search("ad");
    	trie.search("applepie");
    	trie.search("rest");
    	trie.search("jan");
    	trie.search("rent");
    	System.out.println(trie.search("beer"));
    	System.out.println(trie.search("jam"));
    	System.out.println(trie.startsWith("apps"));
    	System.out.println(trie.startsWith("app"));
    	trie.startsWith("ad");
    	trie.startsWith("applepie");
    	trie.startsWith("rent");
    	trie.startsWith("jan");
    	trie.startsWith("rent");
    	trie.startsWith("beer");
    	trie.startsWith("jam");
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");