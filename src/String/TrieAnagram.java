package String;

import javax.xml.stream.FactoryConfigurationError;
import java.util.LinkedList;

public class TrieAnagram {

    public static final int CHAR_NUMBER = 26;

    public static class TrieNode{
        boolean isLeaf;
        TrieNode[] child = new TrieNode[CHAR_NUMBER];
        LinkedList<Integer> head;
        TrieNode(){
            isLeaf = false;
            head = new LinkedList<>();
            for(int i=0;i<CHAR_NUMBER;i++){
                child[i]=null;
            }
        }
    }

    public static TrieNode insert(TrieNode root,String s){
        int n= s.length();
        TrieNode current = root;
        return null;
    }

    public static void main(String[] args){
        String[] words = { "cat", "dog", "tac", "god", "act" };
    }
}
