package lib.zj.office.fc.hslf.model;

import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.hslf.record.AnimationInfo;
import lib.zj.office.fc.hslf.record.AnimationInfoAtom;
import lib.zj.office.fc.hslf.record.ExMCIMovie;
import lib.zj.office.fc.hslf.record.ExObjList;
import lib.zj.office.fc.hslf.record.ExVideoContainer;
import lib.zj.office.fc.hslf.record.OEShapeAtom;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.RecordTypes;

/* loaded from: classes3.dex */
public final class MovieShape extends Picture {
    public static final int DEFAULT_MOVIE_THUMBNAIL = -1;
    public static final int MOVIE_AVI = 2;
    public static final int MOVIE_MPEG = 1;

    public MovieShape(int i10, int i11) {
        super(i11, (Shape) null);
        setMovieIndex(i10);
        setAutoPlay(true);
    }

    @Override // lib.zj.office.fc.hslf.model.Picture
    public EscherContainerRecord createSpContainer(int i10, boolean z10) {
        EscherContainerRecord createSpContainer = super.createSpContainer(i10, z10);
        this._escherContainer = createSpContainer;
        return createSpContainer;
    }

    public String getPath() {
        Record[] childRecords;
        int options = ((OEShapeAtom) getClientDataRecord(RecordTypes.OEShapeAtom.typeID)).getOptions();
        ExObjList exObjList = (ExObjList) getSheet().getSlideShow().getDocumentRecord().findFirstOfType(RecordTypes.ExObjList.typeID);
        if (exObjList == null) {
            return null;
        }
        for (Record record : exObjList.getChildRecords()) {
            if (record instanceof ExMCIMovie) {
                ExVideoContainer exVideo = ((ExMCIMovie) record).getExVideo();
                if (exVideo.getExMediaAtom().getObjectId() == options) {
                    return exVideo.getPathAtom().getText();
                }
            }
        }
        return null;
    }

    public boolean isAutoPlay() {
        AnimationInfo animationInfo = (AnimationInfo) getClientDataRecord(RecordTypes.AnimationInfo.typeID);
        if (animationInfo != null) {
            return animationInfo.getAnimationInfoAtom().getFlag(4);
        }
        return false;
    }

    public void setAutoPlay(boolean z10) {
        AnimationInfo animationInfo = (AnimationInfo) getClientDataRecord(RecordTypes.AnimationInfo.typeID);
        if (animationInfo != null) {
            animationInfo.getAnimationInfoAtom().setFlag(4, z10);
            updateClientData();
        }
    }

    public void setMovieIndex(int i10) {
        ((OEShapeAtom) getClientDataRecord(RecordTypes.OEShapeAtom.typeID)).setOptions(i10);
        AnimationInfo animationInfo = (AnimationInfo) getClientDataRecord(RecordTypes.AnimationInfo.typeID);
        if (animationInfo != null) {
            AnimationInfoAtom animationInfoAtom = animationInfo.getAnimationInfoAtom();
            animationInfoAtom.setDimColor(117440512);
            animationInfoAtom.setFlag(4, true);
            animationInfoAtom.setFlag(256, true);
            animationInfoAtom.setFlag(1024, true);
            animationInfoAtom.setOrderID(i10 + 1);
        }
    }

    public MovieShape(int i10, int i11, Shape shape) {
        super(i11, shape);
        setMovieIndex(i10);
    }

    public MovieShape(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }
}
