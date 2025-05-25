package com.tom_roush.pdfbox.pdmodel;

import b.a;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes2.dex */
public class PDPageTree implements COSObjectable, Iterable<PDPage> {
    private final PDDocument document;
    private final COSDictionary root;

    /* loaded from: classes2.dex */
    public final class PageIterator implements Iterator<PDPage> {
        private final Queue<COSDictionary> queue;
        private Set<COSDictionary> set;

        public /* synthetic */ PageIterator(PDPageTree pDPageTree, COSDictionary cOSDictionary, int i10) {
            this(cOSDictionary);
        }

        private void enqueueKids(COSDictionary cOSDictionary) {
            if (PDPageTree.this.isPageTreeNode(cOSDictionary)) {
                for (COSDictionary cOSDictionary2 : PDPageTree.this.getKids(cOSDictionary)) {
                    if (!this.set.contains(cOSDictionary2)) {
                        if (cOSDictionary2.containsKey(COSName.KIDS)) {
                            this.set.add(cOSDictionary2);
                        }
                        enqueueKids(cOSDictionary2);
                    }
                }
                return;
            }
            this.queue.add(cOSDictionary);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private PageIterator(COSDictionary cOSDictionary) {
            this.queue = new ArrayDeque();
            this.set = new HashSet();
            enqueueKids(cOSDictionary);
            this.set = null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public PDPage next() {
            if (hasNext()) {
                COSDictionary poll = this.queue.poll();
                PDPageTree.sanitizeType(poll);
                return new PDPage(poll, PDPageTree.this.document != null ? PDPageTree.this.document.getResourceCache() : null);
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class SearchContext {
        private boolean found;
        private int index;
        private final COSDictionary searched;

        public /* synthetic */ SearchContext(PDPage pDPage, int i10) {
            this(pDPage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void visitPage(COSDictionary cOSDictionary) {
            boolean z10 = true;
            this.index++;
            if (this.searched != cOSDictionary) {
                z10 = false;
            }
            this.found = z10;
        }

        private SearchContext(PDPage pDPage) {
            this.index = -1;
            this.searched = pDPage.getCOSObject();
        }
    }

    public PDPageTree() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.root = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.PAGES);
        cOSDictionary.setItem(COSName.KIDS, (COSBase) new COSArray());
        cOSDictionary.setItem(COSName.COUNT, (COSBase) COSInteger.ZERO);
        this.document = null;
    }

    private boolean findPage(SearchContext searchContext, COSDictionary cOSDictionary) {
        for (COSDictionary cOSDictionary2 : getKids(cOSDictionary)) {
            if (searchContext.found) {
                break;
            } else if (!isPageTreeNode(cOSDictionary2)) {
                searchContext.visitPage(cOSDictionary2);
            } else {
                findPage(searchContext, cOSDictionary2);
            }
        }
        return searchContext.found;
    }

    public static COSBase getInheritableAttribute(COSDictionary cOSDictionary, COSName cOSName) {
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName);
        if (dictionaryObject != null) {
            return dictionaryObject;
        }
        COSBase dictionaryObject2 = cOSDictionary.getDictionaryObject(COSName.PARENT, COSName.P);
        if (dictionaryObject2 instanceof COSDictionary) {
            COSDictionary cOSDictionary2 = (COSDictionary) dictionaryObject2;
            if (COSName.PAGES.equals(cOSDictionary2.getDictionaryObject(COSName.TYPE))) {
                return getInheritableAttribute(cOSDictionary2, cOSName);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<COSDictionary> getKids(COSDictionary cOSDictionary) {
        ArrayList arrayList = new ArrayList();
        COSArray cOSArray = cOSDictionary.getCOSArray(COSName.KIDS);
        if (cOSArray == null) {
            return arrayList;
        }
        int size = cOSArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            COSBase object = cOSArray.getObject(i10);
            if (object instanceof COSDictionary) {
                arrayList.add((COSDictionary) object);
            }
        }
        return arrayList;
    }

    private void increaseParents(COSDictionary cOSDictionary) {
        do {
            COSName cOSName = COSName.COUNT;
            cOSDictionary.setInt(cOSName, cOSDictionary.getInt(cOSName) + 1);
            cOSDictionary = (COSDictionary) cOSDictionary.getDictionaryObject(COSName.PARENT);
        } while (cOSDictionary != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPageTreeNode(COSDictionary cOSDictionary) {
        if (cOSDictionary != null && (cOSDictionary.getCOSName(COSName.TYPE) == COSName.PAGES || cOSDictionary.containsKey(COSName.KIDS))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sanitizeType(COSDictionary cOSDictionary) {
        COSName cOSName = COSName.TYPE;
        COSName cOSName2 = cOSDictionary.getCOSName(cOSName);
        if (cOSName2 == null) {
            cOSDictionary.setItem(cOSName, (COSBase) COSName.PAGE);
        } else if (COSName.PAGE.equals(cOSName2)) {
        } else {
            throw new IllegalStateException("Expected 'Page' but found " + cOSName2);
        }
    }

    public void add(PDPage pDPage) {
        COSDictionary cOSObject = pDPage.getCOSObject();
        cOSObject.setItem(COSName.PARENT, (COSBase) this.root);
        ((COSArray) this.root.getDictionaryObject(COSName.KIDS)).add((COSBase) cOSObject);
        do {
            cOSObject = (COSDictionary) cOSObject.getDictionaryObject(COSName.PARENT, COSName.P);
            if (cOSObject != null) {
                COSName cOSName = COSName.COUNT;
                cOSObject.setInt(cOSName, cOSObject.getInt(cOSName) + 1);
                continue;
            }
        } while (cOSObject != null);
    }

    public PDPage get(int i10) {
        COSDictionary cOSDictionary = get(i10 + 1, this.root, 0);
        sanitizeType(cOSDictionary);
        PDDocument pDDocument = this.document;
        return new PDPage(cOSDictionary, pDDocument != null ? pDDocument.getResourceCache() : null);
    }

    public int getCount() {
        return this.root.getInt(COSName.COUNT, 0);
    }

    public int indexOf(PDPage pDPage) {
        SearchContext searchContext = new SearchContext(pDPage, 0);
        if (findPage(searchContext, this.root)) {
            return searchContext.index;
        }
        return -1;
    }

    public void insertAfter(PDPage pDPage, PDPage pDPage2) {
        COSDictionary cOSDictionary = (COSDictionary) pDPage2.getCOSObject().getDictionaryObject(COSName.PARENT);
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(COSName.KIDS);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= cOSArray.size()) {
                break;
            } else if (((COSDictionary) cOSArray.getObject(i10)).equals(pDPage2.getCOSObject())) {
                z10 = true;
                cOSArray.add(i10 + 1, pDPage.getCOSObject());
                pDPage.getCOSObject().setItem(COSName.PARENT, (COSBase) cOSDictionary);
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            increaseParents(cOSDictionary);
            return;
        }
        throw new IllegalArgumentException("attempted to insert before orphan page");
    }

    public void insertBefore(PDPage pDPage, PDPage pDPage2) {
        COSDictionary cOSDictionary = (COSDictionary) pDPage2.getCOSObject().getDictionaryObject(COSName.PARENT);
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(COSName.KIDS);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= cOSArray.size()) {
                break;
            } else if (((COSDictionary) cOSArray.getObject(i10)).equals(pDPage2.getCOSObject())) {
                cOSArray.add(i10, pDPage.getCOSObject());
                pDPage.getCOSObject().setItem(COSName.PARENT, (COSBase) cOSDictionary);
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            increaseParents(cOSDictionary);
            return;
        }
        throw new IllegalArgumentException("attempted to insert before orphan page");
    }

    @Override // java.lang.Iterable
    public Iterator<PDPage> iterator() {
        return new PageIterator(this, this.root, 0);
    }

    public void remove(int i10) {
        remove(get(i10 + 1, this.root, 0));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.root;
    }

    public void remove(PDPage pDPage) {
        remove(pDPage.getCOSObject());
    }

    private void remove(COSDictionary cOSDictionary) {
        if (((COSArray) ((COSDictionary) cOSDictionary.getDictionaryObject(COSName.PARENT, COSName.P)).getDictionaryObject(COSName.KIDS)).removeObject(cOSDictionary)) {
            do {
                cOSDictionary = (COSDictionary) cOSDictionary.getDictionaryObject(COSName.PARENT, COSName.P);
                if (cOSDictionary != null) {
                    COSName cOSName = COSName.COUNT;
                    cOSDictionary.setInt(cOSName, cOSDictionary.getInt(cOSName) - 1);
                    continue;
                }
            } while (cOSDictionary != null);
        }
    }

    private COSDictionary get(int i10, COSDictionary cOSDictionary, int i11) {
        if (i10 >= 0) {
            if (isPageTreeNode(cOSDictionary)) {
                if (i10 <= cOSDictionary.getInt(COSName.COUNT, 0) + i11) {
                    for (COSDictionary cOSDictionary2 : getKids(cOSDictionary)) {
                        if (isPageTreeNode(cOSDictionary2)) {
                            int i12 = cOSDictionary2.getInt(COSName.COUNT, 0) + i11;
                            if (i10 <= i12) {
                                return get(i10, cOSDictionary2, i11);
                            }
                            i11 = i12;
                        } else {
                            i11++;
                            if (i10 == i11) {
                                return get(i10, cOSDictionary2, i11);
                            }
                        }
                    }
                    throw new IllegalStateException(a.c("1-based index not found: ", i10));
                } else {
                    throw new IndexOutOfBoundsException(a.c("1-based index out of bounds: ", i10));
                }
            }
            if (i11 == i10) {
                return cOSDictionary;
            }
            throw new IllegalStateException(a.c("1-based index not found: ", i10));
        }
        throw new IndexOutOfBoundsException(a.c("Index out of bounds: ", i10));
    }

    public PDPageTree(COSDictionary cOSDictionary) {
        this(cOSDictionary, null);
    }

    public PDPageTree(COSDictionary cOSDictionary, PDDocument pDDocument) {
        if (cOSDictionary != null) {
            if (COSName.PAGE.equals(cOSDictionary.getCOSName(COSName.TYPE))) {
                COSArray cOSArray = new COSArray();
                cOSArray.add((COSBase) cOSDictionary);
                COSDictionary cOSDictionary2 = new COSDictionary();
                this.root = cOSDictionary2;
                cOSDictionary2.setItem(COSName.KIDS, (COSBase) cOSArray);
                cOSDictionary2.setInt(COSName.COUNT, 1);
            } else {
                this.root = cOSDictionary;
            }
            this.document = pDDocument;
            return;
        }
        throw new IllegalArgumentException("page tree root cannot be null");
    }
}
