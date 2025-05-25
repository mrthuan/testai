package lib.zj.office.fc.sl.usermodel;

/* loaded from: classes3.dex */
public interface Slide extends Sheet {
    boolean getFollowMasterBackground();

    boolean getFollowMasterColourScheme();

    boolean getFollowMasterObjects();

    Notes getNotes();

    void setFollowMasterBackground(boolean z10);

    void setFollowMasterColourScheme(boolean z10);

    void setFollowMasterObjects(boolean z10);

    void setNotes(Notes notes);
}
