package lib.zj.office.fc.hwpf.usermodel;

/* loaded from: classes3.dex */
public interface Field {
    public static final byte ADDIN = 81;
    public static final byte ADDRESSBLOCK = 93;
    public static final byte ADVANCE = 84;
    public static final byte ASK = 38;
    public static final byte AUTHOR = 17;
    public static final byte AUTONUM = 54;
    public static final byte AUTONUMLGL = 53;
    public static final byte AUTONUMOUT = 52;
    public static final byte AUTOTEXT = 79;
    public static final byte AUTOTEXTLIST = 89;
    public static final byte BARCODE = 63;
    public static final byte BIDIOUTLINE = 92;
    public static final byte COMMENTS = 19;
    public static final byte COMPARE = 80;
    public static final byte CONTROL = 87;
    public static final byte CREATEDATE = 21;
    public static final byte DATA = 40;
    public static final byte DATE = 31;
    public static final byte DDE = 45;
    public static final byte DDEAUTO = 46;
    public static final byte DOCPROPERTY = 85;
    public static final byte DOCVARIABLE = 64;
    public static final byte EDITTIME = 25;
    public static final byte EMBED = 58;
    public static final byte EQ = 49;
    public static final byte Equals = 34;
    public static final byte FILENAME = 29;
    public static final byte FILESIZE = 69;
    public static final byte FILLIN = 39;
    public static final byte FORMCHECKBOX = 71;
    public static final byte FORMDROPDOWN = 83;
    public static final byte FORMTEXT = 70;
    public static final byte FTNREF = 5;
    public static final byte GLOSSARY = 47;
    public static final byte GOTOBUTTON = 50;
    public static final byte GREETINGLINE = 94;
    public static final byte HTMLCONTROL = 91;
    public static final byte HYPERLINK = 88;
    public static final byte IF = 7;
    public static final byte IMPORT = 55;
    public static final byte INCLUDE = 36;
    public static final byte INCLUDEPICTURE = 67;
    public static final byte INCLUDETEXT = 68;
    public static final byte INDEX = 8;
    public static final byte INFO = 14;
    public static final byte KEYWORDS = 18;
    public static final byte LASTSAVEDBY = 20;
    public static final byte LINK = 56;
    public static final byte LISTNUM = 90;
    public static final byte MACROBUTTON = 51;
    public static final byte MERGEFIELD = 59;
    public static final byte MERGEREC = 44;
    public static final byte MERGESEQ = 75;
    public static final byte NEXT = 41;
    public static final byte NEXTIF = 42;
    public static final byte NOTEREF = 72;
    public static final byte NUMCHARS = 28;
    public static final byte NUMPAGES = 26;
    public static final byte NUMWORDS = 27;
    public static final byte PAGE = 33;
    public static final byte PAGEREF = 37;
    public static final byte PRINT = 48;
    public static final byte PRINTDATE = 23;
    public static final byte QUOTE = 35;
    public static final byte REF = 3;
    public static final byte REVNUM = 24;
    public static final byte SAVEDATE = 22;
    public static final byte SECTION = 65;
    public static final byte SECTIONPAGES = 66;
    public static final byte SEQ = 12;
    public static final byte SET = 6;
    public static final byte SHAPE = 95;
    public static final byte SKIPIF = 43;
    public static final byte STYLEREF = 10;
    public static final byte SUBJECT = 16;
    public static final byte SYMBOL = 57;
    public static final byte TEMPLATE = 30;
    public static final byte TIME = 32;
    public static final byte TITLE = 15;
    public static final byte TOA = 73;
    public static final byte TOC = 13;
    public static final byte USERADDRESS = 62;
    public static final byte USERINITIALS = 61;
    public static final byte USERNAME = 60;

    Range firstSubrange(Range range);

    int getFieldEndOffset();

    int getFieldStartOffset();

    CharacterRun getMarkEndCharacterRun(Range range);

    int getMarkEndOffset();

    CharacterRun getMarkSeparatorCharacterRun(Range range);

    int getMarkSeparatorOffset();

    CharacterRun getMarkStartCharacterRun(Range range);

    int getMarkStartOffset();

    int getType();

    boolean hasSeparator();

    boolean isHasSep();

    boolean isLocked();

    boolean isNested();

    boolean isPrivateResult();

    boolean isResultDirty();

    boolean isResultEdited();

    boolean isZombieEmbed();

    Range secondSubrange(Range range);
}
