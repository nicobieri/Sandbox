package src.ch.teko.nb.demo;

import java.util.HashMap;

public class TrieNode {
    HashMap<Character, TrieNode> children;
    boolean isComplete = false;
}
