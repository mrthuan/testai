package lib.zj.office.fc.dom4j.tree;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.dom4j.IllegalAddException;
import lib.zj.office.fc.dom4j.Node;

/* loaded from: classes3.dex */
public class ContentListFacade extends AbstractList {
    private AbstractBranch branch;
    private List branchContent;

    public ContentListFacade(AbstractBranch abstractBranch, List list) {
        this.branch = abstractBranch;
        this.branchContent = list;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        this.branch.childAdded(asNode(obj));
        return this.branchContent.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        int size = this.branchContent.size();
        for (Object obj : collection) {
            add(obj);
            size++;
        }
        return size == this.branchContent.size();
    }

    public Node asNode(Object obj) {
        if (obj instanceof Node) {
            return (Node) obj;
        }
        throw new IllegalAddException("This list must contain instances of Node. Invalid type: " + obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            this.branch.childRemoved(asNode(it.next()));
        }
        this.branchContent.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.branchContent.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        return this.branchContent.containsAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.branchContent.get(i10);
    }

    public List getBackingList() {
        return this.branchContent;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return this.branchContent.indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.branchContent.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return this.branchContent.lastIndexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        this.branch.childRemoved(asNode(obj));
        return this.branchContent.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        for (Object obj : collection) {
            this.branch.childRemoved(asNode(obj));
        }
        return this.branchContent.removeAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        this.branch.childAdded(asNode(obj));
        return this.branchContent.set(i10, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.branchContent.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return this.branchContent.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        return this.branchContent.toArray(objArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.branch.childAdded(asNode(obj));
        this.branchContent.add(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        Object remove = this.branchContent.remove(i10);
        if (remove != null) {
            this.branch.childRemoved(asNode(remove));
        }
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        int size = this.branchContent.size();
        for (Object obj : collection) {
            add(i10, obj);
            size--;
            i10++;
        }
        return size == this.branchContent.size();
    }
}
