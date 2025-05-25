package lib.zj.office.fc.hwpf.usermodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hwpf.model.BookmarksTables;
import lib.zj.office.fc.hwpf.model.GenericPropertyNode;
import lib.zj.office.fc.hwpf.model.PropertyNode;

/* loaded from: classes3.dex */
public class BookmarksImpl implements Bookmarks {
    private final BookmarksTables bookmarksTables;
    private Map<Integer, List<GenericPropertyNode>> sortedDescriptors = null;
    private int[] sortedStartPositions = null;

    /* loaded from: classes3.dex */
    public final class BookmarkImpl implements POIBookmark {
        private final GenericPropertyNode first;

        public /* synthetic */ BookmarkImpl(BookmarksImpl bookmarksImpl, GenericPropertyNode genericPropertyNode, int i10) {
            this(genericPropertyNode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || BookmarkImpl.class != obj.getClass()) {
                return false;
            }
            BookmarkImpl bookmarkImpl = (BookmarkImpl) obj;
            GenericPropertyNode genericPropertyNode = this.first;
            if (genericPropertyNode == null) {
                if (bookmarkImpl.first != null) {
                    return false;
                }
            } else if (!genericPropertyNode.equals(bookmarkImpl.first)) {
                return false;
            }
            return true;
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.POIBookmark
        public int getEnd() {
            try {
                return BookmarksImpl.this.bookmarksTables.getDescriptorLim(BookmarksImpl.this.bookmarksTables.getDescriptorFirstIndex(this.first)).getStart();
            } catch (IndexOutOfBoundsException unused) {
                return this.first.getEnd();
            }
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.POIBookmark
        public String getName() {
            try {
                return BookmarksImpl.this.bookmarksTables.getName(BookmarksImpl.this.bookmarksTables.getDescriptorFirstIndex(this.first));
            } catch (ArrayIndexOutOfBoundsException unused) {
                return "";
            }
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.POIBookmark
        public int getStart() {
            return this.first.getStart();
        }

        public int hashCode() {
            int hashCode;
            GenericPropertyNode genericPropertyNode = this.first;
            if (genericPropertyNode == null) {
                hashCode = 0;
            } else {
                hashCode = genericPropertyNode.hashCode();
            }
            return hashCode + 31;
        }

        @Override // lib.zj.office.fc.hwpf.usermodel.POIBookmark
        public void setName(String str) {
            BookmarksImpl.this.bookmarksTables.setName(BookmarksImpl.this.bookmarksTables.getDescriptorFirstIndex(this.first), str);
        }

        public String toString() {
            return "Bookmark [" + getStart() + "; " + getEnd() + "): name: " + getName();
        }

        private BookmarkImpl(GenericPropertyNode genericPropertyNode) {
            this.first = genericPropertyNode;
        }
    }

    public BookmarksImpl(BookmarksTables bookmarksTables) {
        this.bookmarksTables = bookmarksTables;
    }

    private POIBookmark getBookmark(GenericPropertyNode genericPropertyNode) {
        return new BookmarkImpl(this, genericPropertyNode, 0);
    }

    private void updateSortedDescriptors() {
        if (this.sortedDescriptors != null) {
            return;
        }
        HashMap hashMap = new HashMap();
        int i10 = 0;
        for (int i11 = 0; i11 < this.bookmarksTables.getDescriptorsFirstCount(); i11++) {
            GenericPropertyNode descriptorFirst = this.bookmarksTables.getDescriptorFirst(i11);
            Integer valueOf = Integer.valueOf(descriptorFirst.getStart());
            List list = (List) hashMap.get(valueOf);
            if (list == null) {
                list = new LinkedList();
                hashMap.put(valueOf, list);
            }
            list.add(descriptorFirst);
        }
        int[] iArr = new int[hashMap.size()];
        for (Map.Entry entry : hashMap.entrySet()) {
            int i12 = i10 + 1;
            iArr[i10] = ((Integer) entry.getKey()).intValue();
            ArrayList arrayList = new ArrayList((Collection) entry.getValue());
            Collections.sort(arrayList, PropertyNode.EndComparator.instance);
            entry.setValue(arrayList);
            i10 = i12;
        }
        Arrays.sort(iArr);
        this.sortedDescriptors = hashMap;
        this.sortedStartPositions = iArr;
    }

    public List<POIBookmark> getBookmarksAt(int i10) {
        updateSortedDescriptors();
        List<GenericPropertyNode> list = this.sortedDescriptors.get(Integer.valueOf(i10));
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (GenericPropertyNode genericPropertyNode : list) {
                arrayList.add(getBookmark(genericPropertyNode));
            }
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Bookmarks
    public int getBookmarksCount() {
        return this.bookmarksTables.getDescriptorsFirstCount();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Bookmarks
    public Map<Integer, List<POIBookmark>> getBookmarksStartedBetween(int i10, int i11) {
        updateSortedDescriptors();
        int binarySearch = Arrays.binarySearch(this.sortedStartPositions, i10);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 1);
        }
        int binarySearch2 = Arrays.binarySearch(this.sortedStartPositions, i11);
        if (binarySearch2 < 0) {
            binarySearch2 = -(binarySearch2 + 1);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (binarySearch < binarySearch2) {
            int i12 = this.sortedStartPositions[binarySearch];
            if (i12 >= i10) {
                if (i12 >= i11) {
                    break;
                }
                List<POIBookmark> bookmarksAt = getBookmarksAt(i12);
                if (bookmarksAt != null) {
                    linkedHashMap.put(Integer.valueOf(i12), bookmarksAt);
                }
            }
            binarySearch++;
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Bookmarks
    public POIBookmark getBookmark(int i10) {
        return getBookmark(this.bookmarksTables.getDescriptorFirst(i10));
    }
}
