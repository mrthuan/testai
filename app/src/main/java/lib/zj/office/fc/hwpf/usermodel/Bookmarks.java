package lib.zj.office.fc.hwpf.usermodel;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface Bookmarks {
    POIBookmark getBookmark(int i10);

    int getBookmarksCount();

    Map<Integer, List<POIBookmark>> getBookmarksStartedBetween(int i10, int i11);
}
