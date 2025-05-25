package lib.zj.office.fc.dom4j.tree;

import a0.a;
import a0.d;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.dom4j.IllegalAddException;
import lib.zj.office.fc.dom4j.Node;

/* loaded from: classes3.dex */
public class BackedList extends ArrayList {
    private AbstractBranch branch;
    private List branchContent;

    public BackedList(AbstractBranch abstractBranch, List list) {
        this(abstractBranch, list, list.size());
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        this.branch.addNode(asNode(obj));
        return super.add(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureCapacity(collection.size() + size());
        int size = size();
        for (Object obj : collection) {
            add(obj);
            size--;
        }
        return size != 0;
    }

    public void addLocal(Object obj) {
        super.add(obj);
    }

    public Node asNode(Object obj) {
        if (obj instanceof Node) {
            return (Node) obj;
        }
        throw new IllegalAddException("This list must contain instances of Node. Invalid type: " + obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            this.branchContent.remove(next);
            this.branch.childRemoved(asNode(next));
        }
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        this.branch.removeNode(asNode(obj));
        return super.remove(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        int indexOf = this.branchContent.indexOf(get(i10));
        if (indexOf < 0) {
            if (i10 == 0) {
                indexOf = 0;
            } else {
                indexOf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
        }
        if (indexOf < this.branchContent.size()) {
            this.branch.removeNode(asNode(get(i10)));
            this.branch.addNode(indexOf, asNode(obj));
        } else {
            this.branch.removeNode(asNode(get(i10)));
            this.branch.addNode(asNode(obj));
        }
        this.branch.childAdded(asNode(obj));
        return super.set(i10, obj);
    }

    public BackedList(AbstractBranch abstractBranch, List list, int i10) {
        super(i10);
        this.branch = abstractBranch;
        this.branchContent = list;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int indexOf;
        int size = size();
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(a.g("Index value: ", i10, " is less than zero"));
        }
        if (i10 <= size) {
            if (size == 0) {
                indexOf = this.branchContent.size();
            } else if (i10 < size) {
                indexOf = this.branchContent.indexOf(get(i10));
            } else {
                indexOf = this.branchContent.indexOf(get(size - 1)) + 1;
            }
            this.branch.addNode(indexOf, asNode(obj));
            super.add(i10, obj);
            return;
        }
        throw new IndexOutOfBoundsException(d.b("Index value: ", i10, " cannot be greater than the size: ", size));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        Object remove = super.remove(i10);
        if (remove != null) {
            this.branch.removeNode(asNode(remove));
        }
        return remove;
    }

    public BackedList(AbstractBranch abstractBranch, List list, List list2) {
        super(list2);
        this.branch = abstractBranch;
        this.branchContent = list;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        ensureCapacity(collection.size() + size());
        int size = size();
        for (Object obj : collection) {
            add(i10, obj);
            size--;
            i10++;
        }
        return size != 0;
    }
}
