package lib.zj.office.fc.hwpf.usermodel;

import a6.h;
import androidx.activity.r;
import lib.zj.office.fc.hwpf.model.PlexOfField;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
class FieldImpl implements Field {
    private PlexOfField endPlex;
    private PlexOfField separatorPlex;
    private PlexOfField startPlex;

    public FieldImpl(PlexOfField plexOfField, PlexOfField plexOfField2, PlexOfField plexOfField3) {
        if (plexOfField != null) {
            if (plexOfField3 != null) {
                if (plexOfField.getFld().getBoundaryType() == 19) {
                    if (plexOfField2 != null && plexOfField2.getFld().getBoundaryType() != 20) {
                        throw new IllegalArgumentException("separatorPlex" + plexOfField2 + ") is not type of FIELD_SEPARATOR");
                    } else if (plexOfField3.getFld().getBoundaryType() == 21) {
                        this.startPlex = plexOfField;
                        this.separatorPlex = plexOfField2;
                        this.endPlex = plexOfField3;
                        return;
                    } else {
                        throw new IllegalArgumentException("endPlex (" + plexOfField3 + ") is not type of FIELD_END");
                    }
                }
                throw new IllegalArgumentException("startPlex (" + plexOfField + ") is not type of FIELD_BEGIN");
            }
            throw new IllegalArgumentException("endPlex == null");
        }
        throw new IllegalArgumentException("startPlex == null");
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public Range firstSubrange(Range range) {
        if (hasSeparator()) {
            if (getMarkStartOffset() + 1 == getMarkSeparatorOffset()) {
                return null;
            }
            return new Range(getMarkStartOffset() + 1, getMarkSeparatorOffset(), range) { // from class: lib.zj.office.fc.hwpf.usermodel.FieldImpl.1
                @Override // lib.zj.office.fc.hwpf.usermodel.Range
                public String toString() {
                    return r.g(new StringBuilder("FieldSubrange1 ("), super.toString(), ")");
                }
            };
        } else if (getMarkStartOffset() + 1 == getMarkEndOffset()) {
            return null;
        } else {
            return new Range(getMarkStartOffset() + 1, getMarkEndOffset(), range) { // from class: lib.zj.office.fc.hwpf.usermodel.FieldImpl.2
                @Override // lib.zj.office.fc.hwpf.usermodel.Range
                public String toString() {
                    return r.g(new StringBuilder("FieldSubrange1 ("), super.toString(), ")");
                }
            };
        }
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public int getFieldEndOffset() {
        return this.endPlex.getFcStart() + 1;
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public int getFieldStartOffset() {
        return this.startPlex.getFcStart();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public CharacterRun getMarkEndCharacterRun(Range range) {
        return new Range(getMarkEndOffset(), getMarkEndOffset() + 1, range).getCharacterRun(0);
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public int getMarkEndOffset() {
        return this.endPlex.getFcStart();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public CharacterRun getMarkSeparatorCharacterRun(Range range) {
        if (!hasSeparator()) {
            return null;
        }
        return new Range(getMarkSeparatorOffset(), getMarkSeparatorOffset() + 1, range).getCharacterRun(0);
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public int getMarkSeparatorOffset() {
        return this.separatorPlex.getFcStart();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public CharacterRun getMarkStartCharacterRun(Range range) {
        return new Range(getMarkStartOffset(), getMarkStartOffset() + 1, range).getCharacterRun(0);
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public int getMarkStartOffset() {
        return this.startPlex.getFcStart();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public int getType() {
        return this.startPlex.getFld().getFieldType();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public boolean hasSeparator() {
        if (this.separatorPlex != null) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public boolean isHasSep() {
        return this.endPlex.getFld().isFHasSep();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public boolean isLocked() {
        return this.endPlex.getFld().isFLocked();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public boolean isNested() {
        return this.endPlex.getFld().isFNested();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public boolean isPrivateResult() {
        return this.endPlex.getFld().isFPrivateResult();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public boolean isResultDirty() {
        return this.endPlex.getFld().isFResultDirty();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public boolean isResultEdited() {
        return this.endPlex.getFld().isFResultEdited();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public boolean isZombieEmbed() {
        return this.endPlex.getFld().isFZombieEmbed();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Field
    public Range secondSubrange(Range range) {
        if (hasSeparator() && getMarkSeparatorOffset() + 1 != getMarkEndOffset()) {
            return new Range(getMarkSeparatorOffset() + 1, getMarkEndOffset(), range) { // from class: lib.zj.office.fc.hwpf.usermodel.FieldImpl.3
                @Override // lib.zj.office.fc.hwpf.usermodel.Range
                public String toString() {
                    return r.g(new StringBuilder("FieldSubrange2 ("), super.toString(), ")");
                }
            };
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Field [");
        sb2.append(getFieldStartOffset());
        sb2.append("; ");
        sb2.append(getFieldEndOffset());
        sb2.append("] (type: 0x");
        sb2.append(Integer.toHexString(getType()));
        sb2.append(" = ");
        return h.g(sb2, getType(), " )");
    }
}
