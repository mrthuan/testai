package com.tom_roush.pdfbox.util.filetypedetector;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class ByteTrie<T> {
    private int maxDepth;
    private final ByteTrieNode<T> root = new ByteTrieNode<>();

    /* loaded from: classes2.dex */
    public static class ByteTrieNode<T> {
        private final Map<Byte, ByteTrieNode<T>> children = new HashMap();
        private T value = null;

        public T getValue() {
            return this.value;
        }

        public void setValue(T t4) {
            if (this.value == null) {
                this.value = t4;
                return;
            }
            throw new IllegalStateException("Value already set for this trie node");
        }
    }

    public void addPath(T t4, byte[]... bArr) {
        ByteTrieNode<T> byteTrieNode = this.root;
        int i10 = 0;
        for (byte[] bArr2 : bArr) {
            for (byte b10 : bArr2) {
                ByteTrieNode<T> byteTrieNode2 = (ByteTrieNode) ((ByteTrieNode) byteTrieNode).children.get(Byte.valueOf(b10));
                if (byteTrieNode2 == null) {
                    byteTrieNode2 = new ByteTrieNode<>();
                    ((ByteTrieNode) byteTrieNode).children.put(Byte.valueOf(b10), byteTrieNode2);
                }
                byteTrieNode = byteTrieNode2;
                i10++;
            }
        }
        byteTrieNode.setValue(t4);
        this.maxDepth = Math.max(this.maxDepth, i10);
    }

    public T find(byte[] bArr) {
        ByteTrieNode<T> byteTrieNode = this.root;
        T value = byteTrieNode.getValue();
        for (byte b10 : bArr) {
            byteTrieNode = (ByteTrieNode) ((ByteTrieNode) byteTrieNode).children.get(Byte.valueOf(b10));
            if (byteTrieNode == null) {
                break;
            }
            if (byteTrieNode.getValue() != null) {
                value = byteTrieNode.getValue();
            }
        }
        return value;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public void setDefaultValue(T t4) {
        this.root.setValue(t4);
    }
}
