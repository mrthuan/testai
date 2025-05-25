package lib.zj.office.fc.sl.usermodel;

/* loaded from: classes3.dex */
public interface SlideShow {
    MasterSheet createMasterSheet();

    Slide createSlide();

    MasterSheet[] getMasterSheet();

    Resources getResources();

    Slide[] getSlides();
}
