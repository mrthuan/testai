package lib.zj.office.fc.fs.filesystem;

/* loaded from: classes3.dex */
public interface CFBConstants {
    public static final int BIG_BLOCK_MINIMUM_DOCUMENT_SIZE = 4096;
    public static final int DIFAT_SECTOR_BLOCK = -4;
    public static final int END_OF_CHAIN = -2;
    public static final int FAT_SECTOR_BLOCK = -3;
    public static final int LARGER_BIG_BLOCK_SIZE = 4096;
    public static final int LARGEST_REGULAR_SECTOR_NUMBER = -5;
    public static final int PROPERTY_SIZE = 128;
    public static final int SMALLER_BIG_BLOCK_SIZE = 512;
    public static final int SMALL_BLOCK_SIZE = 64;
    public static final int UNUSED_BLOCK = -1;
    public static final BlockSize SMALLER_BIG_BLOCK_SIZE_DETAILS = new BlockSize(512, 9);
    public static final BlockSize LARGER_BIG_BLOCK_SIZE_DETAILS = new BlockSize(4096, 12);
}
