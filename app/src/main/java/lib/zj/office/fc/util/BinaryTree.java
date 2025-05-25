package lib.zj.office.fc.util;

import androidx.activity.r;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public class BinaryTree extends AbstractMap {
    private static int _INDEX_COUNT = 2;
    static int _KEY = 0;
    private static int _MINIMUM_INDEX = 0;
    static int _VALUE = 1;
    private final Set[] _entry_set;
    private final Set[] _key_set;
    int _modifications;
    final Node[] _root;
    int _size;
    private final Collection[] _value_collection;
    private static int _INDEX_SUM = 0 + 1;
    private static String[] _data_name = {"key", "value"};

    /* loaded from: classes3.dex */
    public abstract class BinaryTreeIterator implements Iterator {
        private int _expected_modifications;
        protected Node _last_returned_node = null;
        private Node _next_node;
        private int _type;

        public BinaryTreeIterator(int i10) {
            this._type = i10;
            this._expected_modifications = BinaryTree.this._modifications;
            this._next_node = BinaryTree.leastNode(BinaryTree.this._root[i10], i10);
        }

        public abstract Object doGetNext();

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this._next_node != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            Node node = this._next_node;
            if (node != null) {
                if (BinaryTree.this._modifications == this._expected_modifications) {
                    this._last_returned_node = node;
                    this._next_node = BinaryTree.nextGreater(node, this._type);
                    return doGetNext();
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Node node = this._last_returned_node;
            if (node != null) {
                BinaryTree binaryTree = BinaryTree.this;
                if (binaryTree._modifications == this._expected_modifications) {
                    binaryTree.doRedBlackDelete(node);
                    this._expected_modifications++;
                    this._last_returned_node = null;
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes3.dex */
    public static final class Node implements Map.Entry {
        private Comparable[] _data;
        private int _hashcode;
        private Node[] _left = {null, null};
        private Node[] _right = {null, null};
        private Node[] _parent = {null, null};
        private boolean[] _black = {true, true};
        private boolean _calculated_hashcode = false;

        public Node(Comparable comparable, Comparable comparable2) {
            this._data = new Comparable[]{comparable, comparable2};
        }

        public void copyColor(Node node, int i10) {
            this._black[i10] = node._black[i10];
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (this._data[BinaryTree._KEY].equals(entry.getKey()) && this._data[BinaryTree._VALUE].equals(entry.getValue())) {
                return true;
            }
            return false;
        }

        public Comparable getData(int i10) {
            return this._data[i10];
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this._data[BinaryTree._KEY];
        }

        public Node getLeft(int i10) {
            return this._left[i10];
        }

        public Node getParent(int i10) {
            return this._parent[i10];
        }

        public Node getRight(int i10) {
            return this._right[i10];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this._data[BinaryTree._VALUE];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this._calculated_hashcode) {
                this._hashcode = this._data[BinaryTree._KEY].hashCode() ^ this._data[BinaryTree._VALUE].hashCode();
                this._calculated_hashcode = true;
            }
            return this._hashcode;
        }

        public boolean isBlack(int i10) {
            return this._black[i10];
        }

        public boolean isRed(int i10) {
            return !this._black[i10];
        }

        public void setBlack(int i10) {
            this._black[i10] = true;
        }

        public void setLeft(Node node, int i10) {
            this._left[i10] = node;
        }

        public void setParent(Node node, int i10) {
            this._parent[i10] = node;
        }

        public void setRed(int i10) {
            this._black[i10] = false;
        }

        public void setRight(Node node, int i10) {
            this._right[i10] = node;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Map.Entry.setValue is not supported");
        }

        public void swapColors(Node node, int i10) {
            boolean[] zArr = this._black;
            boolean z10 = zArr[i10];
            boolean[] zArr2 = node._black;
            boolean z11 = z10 ^ zArr2[i10];
            zArr[i10] = z11;
            boolean z12 = z11 ^ zArr2[i10];
            zArr2[i10] = z12;
            zArr[i10] = zArr[i10] ^ z12;
        }
    }

    public BinaryTree() {
        this._size = 0;
        this._modifications = 0;
        this._key_set = new Set[]{null, null};
        this._entry_set = new Set[]{null, null};
        this._value_collection = new Collection[]{null, null};
        this._root = new Node[]{null, null};
    }

    private static void checkKey(Object obj) {
        checkNonNullComparable(obj, _KEY);
    }

    private static void checkKeyAndValue(Object obj, Object obj2) {
        checkKey(obj);
        checkValue(obj2);
    }

    private static void checkNonNullComparable(Object obj, int i10) {
        if (obj != null) {
            if (obj instanceof Comparable) {
                return;
            }
            throw new ClassCastException(r.g(new StringBuilder(), _data_name[i10], " must be Comparable"));
        }
        throw new NullPointerException(r.g(new StringBuilder(), _data_name[i10], " cannot be null"));
    }

    private static void checkValue(Object obj) {
        checkNonNullComparable(obj, _VALUE);
    }

    private static int compare(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    private static void copyColor(Node node, Node node2, int i10) {
        if (node2 != null) {
            if (node == null) {
                node2.setBlack(i10);
            } else {
                node2.copyColor(node, i10);
            }
        }
    }

    private Object doGet(Comparable comparable, int i10) {
        checkNonNullComparable(comparable, i10);
        Node lookup = lookup(comparable, i10);
        if (lookup == null) {
            return null;
        }
        return lookup.getData(oppositeIndex(i10));
    }

    private void doRedBlackDeleteFixup(Node node, int i10) {
        while (node != this._root[i10] && isBlack(node, i10)) {
            if (isLeftChild(node, i10)) {
                Node rightChild = getRightChild(getParent(node, i10), i10);
                if (isRed(rightChild, i10)) {
                    makeBlack(rightChild, i10);
                    makeRed(getParent(node, i10), i10);
                    rotateLeft(getParent(node, i10), i10);
                    rightChild = getRightChild(getParent(node, i10), i10);
                }
                if (isBlack(getLeftChild(rightChild, i10), i10) && isBlack(getRightChild(rightChild, i10), i10)) {
                    makeRed(rightChild, i10);
                    node = getParent(node, i10);
                } else {
                    if (isBlack(getRightChild(rightChild, i10), i10)) {
                        makeBlack(getLeftChild(rightChild, i10), i10);
                        makeRed(rightChild, i10);
                        rotateRight(rightChild, i10);
                        rightChild = getRightChild(getParent(node, i10), i10);
                    }
                    copyColor(getParent(node, i10), rightChild, i10);
                    makeBlack(getParent(node, i10), i10);
                    makeBlack(getRightChild(rightChild, i10), i10);
                    rotateLeft(getParent(node, i10), i10);
                    node = this._root[i10];
                }
            } else {
                Node leftChild = getLeftChild(getParent(node, i10), i10);
                if (isRed(leftChild, i10)) {
                    makeBlack(leftChild, i10);
                    makeRed(getParent(node, i10), i10);
                    rotateRight(getParent(node, i10), i10);
                    leftChild = getLeftChild(getParent(node, i10), i10);
                }
                if (isBlack(getRightChild(leftChild, i10), i10) && isBlack(getLeftChild(leftChild, i10), i10)) {
                    makeRed(leftChild, i10);
                    node = getParent(node, i10);
                } else {
                    if (isBlack(getLeftChild(leftChild, i10), i10)) {
                        makeBlack(getRightChild(leftChild, i10), i10);
                        makeRed(leftChild, i10);
                        rotateLeft(leftChild, i10);
                        leftChild = getLeftChild(getParent(node, i10), i10);
                    }
                    copyColor(getParent(node, i10), leftChild, i10);
                    makeBlack(getParent(node, i10), i10);
                    makeBlack(getLeftChild(leftChild, i10), i10);
                    rotateRight(getParent(node, i10), i10);
                    node = this._root[i10];
                }
            }
        }
        makeBlack(node, i10);
    }

    private void doRedBlackInsert(Node node, int i10) {
        makeRed(node, i10);
        while (node != null && node != this._root[i10] && isRed(node.getParent(i10), i10)) {
            if (isLeftChild(getParent(node, i10), i10)) {
                Node rightChild = getRightChild(getGrandParent(node, i10), i10);
                if (isRed(rightChild, i10)) {
                    makeBlack(getParent(node, i10), i10);
                    makeBlack(rightChild, i10);
                    makeRed(getGrandParent(node, i10), i10);
                    node = getGrandParent(node, i10);
                } else {
                    if (isRightChild(node, i10)) {
                        node = getParent(node, i10);
                        rotateLeft(node, i10);
                    }
                    makeBlack(getParent(node, i10), i10);
                    makeRed(getGrandParent(node, i10), i10);
                    if (getGrandParent(node, i10) != null) {
                        rotateRight(getGrandParent(node, i10), i10);
                    }
                }
            } else {
                Node leftChild = getLeftChild(getGrandParent(node, i10), i10);
                if (isRed(leftChild, i10)) {
                    makeBlack(getParent(node, i10), i10);
                    makeBlack(leftChild, i10);
                    makeRed(getGrandParent(node, i10), i10);
                    node = getGrandParent(node, i10);
                } else {
                    if (isLeftChild(node, i10)) {
                        node = getParent(node, i10);
                        rotateRight(node, i10);
                    }
                    makeBlack(getParent(node, i10), i10);
                    makeRed(getGrandParent(node, i10), i10);
                    if (getGrandParent(node, i10) != null) {
                        rotateLeft(getGrandParent(node, i10), i10);
                    }
                }
            }
        }
        makeBlack(this._root[i10], i10);
    }

    private Object doRemove(Comparable comparable, int i10) {
        Node lookup = lookup(comparable, i10);
        if (lookup != null) {
            Comparable data = lookup.getData(oppositeIndex(i10));
            doRedBlackDelete(lookup);
            return data;
        }
        return null;
    }

    private static Node getGrandParent(Node node, int i10) {
        return getParent(getParent(node, i10), i10);
    }

    private static Node getLeftChild(Node node, int i10) {
        if (node == null) {
            return null;
        }
        return node.getLeft(i10);
    }

    private static Node getParent(Node node, int i10) {
        if (node == null) {
            return null;
        }
        return node.getParent(i10);
    }

    private static Node getRightChild(Node node, int i10) {
        if (node == null) {
            return null;
        }
        return node.getRight(i10);
    }

    private void grow() {
        modify();
        this._size++;
    }

    private void insertValue(Node node) {
        Node node2 = this._root[_VALUE];
        while (true) {
            int compare = compare(node.getData(_VALUE), node2.getData(_VALUE));
            if (compare != 0) {
                if (compare < 0) {
                    if (node2.getLeft(_VALUE) != null) {
                        node2 = node2.getLeft(_VALUE);
                    } else {
                        node2.setLeft(node, _VALUE);
                        node.setParent(node2, _VALUE);
                        doRedBlackInsert(node, _VALUE);
                        return;
                    }
                } else if (node2.getRight(_VALUE) != null) {
                    node2 = node2.getRight(_VALUE);
                } else {
                    node2.setRight(node, _VALUE);
                    node.setParent(node2, _VALUE);
                    doRedBlackInsert(node, _VALUE);
                    return;
                }
            } else {
                throw new IllegalArgumentException("Cannot store a duplicate value (\"" + node.getData(_VALUE) + "\") in this Map");
            }
        }
    }

    private static boolean isBlack(Node node, int i10) {
        if (node == null) {
            return true;
        }
        return node.isBlack(i10);
    }

    private static boolean isLeftChild(Node node, int i10) {
        if (node == null) {
            return true;
        }
        if (node.getParent(i10) != null && node == node.getParent(i10).getLeft(i10)) {
            return true;
        }
        return false;
    }

    private static boolean isRed(Node node, int i10) {
        if (node == null) {
            return false;
        }
        return node.isRed(i10);
    }

    private static boolean isRightChild(Node node, int i10) {
        if (node == null) {
            return true;
        }
        if (node.getParent(i10) != null && node == node.getParent(i10).getRight(i10)) {
            return true;
        }
        return false;
    }

    public static Node leastNode(Node node, int i10) {
        if (node != null) {
            while (node.getLeft(i10) != null) {
                node = node.getLeft(i10);
            }
        }
        return node;
    }

    private static void makeBlack(Node node, int i10) {
        if (node != null) {
            node.setBlack(i10);
        }
    }

    private static void makeRed(Node node, int i10) {
        if (node != null) {
            node.setRed(i10);
        }
    }

    private void modify() {
        this._modifications++;
    }

    public static Node nextGreater(Node node, int i10) {
        if (node == null) {
            return null;
        }
        if (node.getRight(i10) != null) {
            return leastNode(node.getRight(i10), i10);
        }
        Node parent = node.getParent(i10);
        while (true) {
            Node node2 = parent;
            Node node3 = node;
            node = node2;
            if (node != null && node3 == node.getRight(i10)) {
                parent = node.getParent(i10);
            } else {
                return node;
            }
        }
    }

    private int oppositeIndex(int i10) {
        return _INDEX_SUM - i10;
    }

    private void rotateLeft(Node node, int i10) {
        Node right = node.getRight(i10);
        node.setRight(right.getLeft(i10), i10);
        if (right.getLeft(i10) != null) {
            right.getLeft(i10).setParent(node, i10);
        }
        right.setParent(node.getParent(i10), i10);
        if (node.getParent(i10) == null) {
            this._root[i10] = right;
        } else if (node.getParent(i10).getLeft(i10) == node) {
            node.getParent(i10).setLeft(right, i10);
        } else {
            node.getParent(i10).setRight(right, i10);
        }
        right.setLeft(node, i10);
        node.setParent(right, i10);
    }

    private void rotateRight(Node node, int i10) {
        Node left = node.getLeft(i10);
        node.setLeft(left.getRight(i10), i10);
        if (left.getRight(i10) != null) {
            left.getRight(i10).setParent(node, i10);
        }
        left.setParent(node.getParent(i10), i10);
        if (node.getParent(i10) == null) {
            this._root[i10] = left;
        } else if (node.getParent(i10).getRight(i10) == node) {
            node.getParent(i10).setRight(left, i10);
        } else {
            node.getParent(i10).setLeft(left, i10);
        }
        left.setRight(node, i10);
        node.setParent(left, i10);
    }

    private void shrink() {
        modify();
        this._size--;
    }

    private void swapPosition(Node node, Node node2, int i10) {
        boolean z10;
        Node parent = node.getParent(i10);
        Node left = node.getLeft(i10);
        Node right = node.getRight(i10);
        Node parent2 = node2.getParent(i10);
        Node left2 = node2.getLeft(i10);
        Node right2 = node2.getRight(i10);
        boolean z11 = true;
        if (node.getParent(i10) != null && node == node.getParent(i10).getLeft(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (node2.getParent(i10) == null || node2 != node2.getParent(i10).getLeft(i10)) {
            z11 = false;
        }
        if (node == parent2) {
            node.setParent(node2, i10);
            if (z11) {
                node2.setLeft(node, i10);
                node2.setRight(right, i10);
            } else {
                node2.setRight(node, i10);
                node2.setLeft(left, i10);
            }
        } else {
            node.setParent(parent2, i10);
            if (parent2 != null) {
                if (z11) {
                    parent2.setLeft(node, i10);
                } else {
                    parent2.setRight(node, i10);
                }
            }
            node2.setLeft(left, i10);
            node2.setRight(right, i10);
        }
        if (node2 == parent) {
            node2.setParent(node, i10);
            if (z10) {
                node.setLeft(node2, i10);
                node.setRight(right2, i10);
            } else {
                node.setRight(node2, i10);
                node.setLeft(left2, i10);
            }
        } else {
            node2.setParent(parent, i10);
            if (parent != null) {
                if (z10) {
                    parent.setLeft(node2, i10);
                } else {
                    parent.setRight(node2, i10);
                }
            }
            node.setLeft(left2, i10);
            node.setRight(right2, i10);
        }
        if (node.getLeft(i10) != null) {
            node.getLeft(i10).setParent(node, i10);
        }
        if (node.getRight(i10) != null) {
            node.getRight(i10).setParent(node, i10);
        }
        if (node2.getLeft(i10) != null) {
            node2.getLeft(i10).setParent(node2, i10);
        }
        if (node2.getRight(i10) != null) {
            node2.getRight(i10).setParent(node2, i10);
        }
        node.swapColors(node2, i10);
        Node[] nodeArr = this._root;
        Node node3 = nodeArr[i10];
        if (node3 == node) {
            nodeArr[i10] = node2;
        } else if (node3 == node2) {
            nodeArr[i10] = node;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        modify();
        this._size = 0;
        Node[] nodeArr = this._root;
        nodeArr[_KEY] = null;
        nodeArr[_VALUE] = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        checkKey(obj);
        if (lookup((Comparable) obj, _KEY) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        checkValue(obj);
        if (lookup((Comparable) obj, _VALUE) != null) {
            return true;
        }
        return false;
    }

    public void doRedBlackDelete(Node node) {
        Node right;
        for (int i10 = _MINIMUM_INDEX; i10 < _INDEX_COUNT; i10++) {
            if (node.getLeft(i10) != null && node.getRight(i10) != null) {
                swapPosition(nextGreater(node, i10), node, i10);
            }
            if (node.getLeft(i10) != null) {
                right = node.getLeft(i10);
            } else {
                right = node.getRight(i10);
            }
            if (right != null) {
                right.setParent(node.getParent(i10), i10);
                if (node.getParent(i10) == null) {
                    this._root[i10] = right;
                } else if (node == node.getParent(i10).getLeft(i10)) {
                    node.getParent(i10).setLeft(right, i10);
                } else {
                    node.getParent(i10).setRight(right, i10);
                }
                node.setLeft(null, i10);
                node.setRight(null, i10);
                node.setParent(null, i10);
                if (isBlack(node, i10)) {
                    doRedBlackDeleteFixup(right, i10);
                }
            } else if (node.getParent(i10) == null) {
                this._root[i10] = null;
            } else {
                if (isBlack(node, i10)) {
                    doRedBlackDeleteFixup(node, i10);
                }
                if (node.getParent(i10) != null) {
                    if (node == node.getParent(i10).getLeft(i10)) {
                        node.getParent(i10).setLeft(null, i10);
                    } else {
                        node.getParent(i10).setRight(null, i10);
                    }
                    node.setParent(null, i10);
                }
            }
        }
        shrink();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set[] setArr = this._entry_set;
        int i10 = _KEY;
        if (setArr[i10] == null) {
            setArr[i10] = new AbstractSet() { // from class: lib.zj.office.fc.util.BinaryTree.6
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public void clear() {
                    BinaryTree.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                    if (!(obj instanceof Map.Entry)) {
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    Object value = entry.getValue();
                    Node lookup = BinaryTree.this.lookup((Comparable) entry.getKey(), BinaryTree._KEY);
                    if (lookup == null || !lookup.getData(BinaryTree._VALUE).equals(value)) {
                        return false;
                    }
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    return new BinaryTreeIterator(BinaryTree._KEY) { // from class: lib.zj.office.fc.util.BinaryTree.6.1
                        {
                            BinaryTree binaryTree = BinaryTree.this;
                        }

                        @Override // lib.zj.office.fc.util.BinaryTree.BinaryTreeIterator
                        public Object doGetNext() {
                            return this._last_returned_node;
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                    if (!(obj instanceof Map.Entry)) {
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    Object value = entry.getValue();
                    Node lookup = BinaryTree.this.lookup((Comparable) entry.getKey(), BinaryTree._KEY);
                    if (lookup == null || !lookup.getData(BinaryTree._VALUE).equals(value)) {
                        return false;
                    }
                    BinaryTree.this.doRedBlackDelete(lookup);
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return BinaryTree.this.size();
                }
            };
        }
        return this._entry_set[_KEY];
    }

    public Set entrySetByValue() {
        Set[] setArr = this._entry_set;
        int i10 = _VALUE;
        if (setArr[i10] == null) {
            setArr[i10] = new AbstractSet() { // from class: lib.zj.office.fc.util.BinaryTree.1
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public void clear() {
                    BinaryTree.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                    if (!(obj instanceof Map.Entry)) {
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Node lookup = BinaryTree.this.lookup((Comparable) entry.getValue(), BinaryTree._VALUE);
                    if (lookup == null || !lookup.getData(BinaryTree._KEY).equals(key)) {
                        return false;
                    }
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    return new BinaryTreeIterator(BinaryTree._VALUE) { // from class: lib.zj.office.fc.util.BinaryTree.1.1
                        {
                            BinaryTree binaryTree = BinaryTree.this;
                        }

                        @Override // lib.zj.office.fc.util.BinaryTree.BinaryTreeIterator
                        public Object doGetNext() {
                            return this._last_returned_node;
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                    if (!(obj instanceof Map.Entry)) {
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Node lookup = BinaryTree.this.lookup((Comparable) entry.getValue(), BinaryTree._VALUE);
                    if (lookup == null || !lookup.getData(BinaryTree._KEY).equals(key)) {
                        return false;
                    }
                    BinaryTree.this.doRedBlackDelete(lookup);
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return BinaryTree.this.size();
                }
            };
        }
        return this._entry_set[_VALUE];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return doGet((Comparable) obj, _KEY);
    }

    public Object getKeyForValue(Object obj) {
        return doGet((Comparable) obj, _VALUE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set[] setArr = this._key_set;
        int i10 = _KEY;
        if (setArr[i10] == null) {
            setArr[i10] = new AbstractSet() { // from class: lib.zj.office.fc.util.BinaryTree.4
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public void clear() {
                    BinaryTree.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                    return BinaryTree.this.containsKey(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    return new BinaryTreeIterator(BinaryTree._KEY) { // from class: lib.zj.office.fc.util.BinaryTree.4.1
                        {
                            BinaryTree binaryTree = BinaryTree.this;
                        }

                        @Override // lib.zj.office.fc.util.BinaryTree.BinaryTreeIterator
                        public Object doGetNext() {
                            return this._last_returned_node.getData(BinaryTree._KEY);
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                    BinaryTree binaryTree = BinaryTree.this;
                    int i11 = binaryTree._size;
                    binaryTree.remove(obj);
                    if (BinaryTree.this._size != i11) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return BinaryTree.this.size();
                }
            };
        }
        return this._key_set[_KEY];
    }

    public Set keySetByValue() {
        Set[] setArr = this._key_set;
        int i10 = _VALUE;
        if (setArr[i10] == null) {
            setArr[i10] = new AbstractSet() { // from class: lib.zj.office.fc.util.BinaryTree.2
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public void clear() {
                    BinaryTree.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                    return BinaryTree.this.containsKey(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    return new BinaryTreeIterator(BinaryTree._VALUE) { // from class: lib.zj.office.fc.util.BinaryTree.2.1
                        {
                            BinaryTree binaryTree = BinaryTree.this;
                        }

                        @Override // lib.zj.office.fc.util.BinaryTree.BinaryTreeIterator
                        public Object doGetNext() {
                            return this._last_returned_node.getData(BinaryTree._KEY);
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                    BinaryTree binaryTree = BinaryTree.this;
                    int i11 = binaryTree._size;
                    binaryTree.remove(obj);
                    if (BinaryTree.this._size != i11) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return BinaryTree.this.size();
                }
            };
        }
        return this._key_set[_VALUE];
    }

    public Node lookup(Comparable comparable, int i10) {
        Node node = this._root[i10];
        while (node != null) {
            int compare = compare(comparable, node.getData(i10));
            if (compare != 0) {
                if (compare < 0) {
                    node = node.getLeft(i10);
                } else {
                    node = node.getRight(i10);
                }
            } else {
                return node;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        checkKeyAndValue(obj, obj2);
        Node node = this._root[_KEY];
        if (node == null) {
            Node node2 = new Node((Comparable) obj, (Comparable) obj2);
            Node[] nodeArr = this._root;
            nodeArr[_KEY] = node2;
            nodeArr[_VALUE] = node2;
            grow();
            return null;
        }
        while (true) {
            Comparable comparable = (Comparable) obj;
            int compare = compare(comparable, node.getData(_KEY));
            if (compare != 0) {
                if (compare < 0) {
                    if (node.getLeft(_KEY) != null) {
                        node = node.getLeft(_KEY);
                    } else {
                        Node node3 = new Node(comparable, (Comparable) obj2);
                        insertValue(node3);
                        node.setLeft(node3, _KEY);
                        node3.setParent(node, _KEY);
                        doRedBlackInsert(node3, _KEY);
                        grow();
                        return null;
                    }
                } else if (node.getRight(_KEY) != null) {
                    node = node.getRight(_KEY);
                } else {
                    Node node4 = new Node(comparable, (Comparable) obj2);
                    insertValue(node4);
                    node.setRight(node4, _KEY);
                    node4.setParent(node, _KEY);
                    doRedBlackInsert(node4, _KEY);
                    grow();
                    return null;
                }
            } else {
                throw new IllegalArgumentException("Cannot store a duplicate key (\"" + obj + "\") in this Map");
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return doRemove((Comparable) obj, _KEY);
    }

    public Object removeValue(Object obj) {
        return doRemove((Comparable) obj, _VALUE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this._size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection[] collectionArr = this._value_collection;
        int i10 = _KEY;
        if (collectionArr[i10] == null) {
            collectionArr[i10] = new AbstractCollection() { // from class: lib.zj.office.fc.util.BinaryTree.5
                @Override // java.util.AbstractCollection, java.util.Collection
                public void clear() {
                    BinaryTree.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public boolean contains(Object obj) {
                    return BinaryTree.this.containsValue(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public Iterator iterator() {
                    return new BinaryTreeIterator(BinaryTree._KEY) { // from class: lib.zj.office.fc.util.BinaryTree.5.1
                        {
                            BinaryTree binaryTree = BinaryTree.this;
                        }

                        @Override // lib.zj.office.fc.util.BinaryTree.BinaryTreeIterator
                        public Object doGetNext() {
                            return this._last_returned_node.getData(BinaryTree._VALUE);
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public boolean remove(Object obj) {
                    BinaryTree binaryTree = BinaryTree.this;
                    int i11 = binaryTree._size;
                    binaryTree.removeValue(obj);
                    if (BinaryTree.this._size != i11) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection collection) {
                    boolean z10 = false;
                    for (Object obj : collection) {
                        if (BinaryTree.this.removeValue(obj) != null) {
                            z10 = true;
                        }
                    }
                    return z10;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public int size() {
                    return BinaryTree.this.size();
                }
            };
        }
        return this._value_collection[_KEY];
    }

    public Collection valuesByValue() {
        Collection[] collectionArr = this._value_collection;
        int i10 = _VALUE;
        if (collectionArr[i10] == null) {
            collectionArr[i10] = new AbstractCollection() { // from class: lib.zj.office.fc.util.BinaryTree.3
                @Override // java.util.AbstractCollection, java.util.Collection
                public void clear() {
                    BinaryTree.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public boolean contains(Object obj) {
                    return BinaryTree.this.containsValue(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public Iterator iterator() {
                    return new BinaryTreeIterator(BinaryTree._VALUE) { // from class: lib.zj.office.fc.util.BinaryTree.3.1
                        {
                            BinaryTree binaryTree = BinaryTree.this;
                        }

                        @Override // lib.zj.office.fc.util.BinaryTree.BinaryTreeIterator
                        public Object doGetNext() {
                            return this._last_returned_node.getData(BinaryTree._VALUE);
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public boolean remove(Object obj) {
                    BinaryTree binaryTree = BinaryTree.this;
                    int i11 = binaryTree._size;
                    binaryTree.removeValue(obj);
                    if (BinaryTree.this._size != i11) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection collection) {
                    boolean z10 = false;
                    for (Object obj : collection) {
                        if (BinaryTree.this.removeValue(obj) != null) {
                            z10 = true;
                        }
                    }
                    return z10;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public int size() {
                    return BinaryTree.this.size();
                }
            };
        }
        return this._value_collection[_VALUE];
    }

    public BinaryTree(Map map) {
        this();
        putAll(map);
    }
}
