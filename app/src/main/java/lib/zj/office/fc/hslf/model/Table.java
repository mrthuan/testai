package lib.zj.office.fc.hslf.model;

import a0.a;
import androidx.activity.s;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import lib.zj.office.fc.ddf.EscherArrayProperty;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherTertiaryOptRecord;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.java.awt.Rectangle;

/* loaded from: classes3.dex */
public final class Table extends ShapeGroup {
    protected static final int BORDERS_ALL = 5;
    protected static final int BORDERS_INSIDE = 7;
    protected static final int BORDERS_NONE = 8;
    protected static final int BORDERS_OUTSIDE = 6;
    protected static final int BORDER_BOTTOM = 3;
    protected static final int BORDER_LEFT = 4;
    protected static final int BORDER_RIGHT = 2;
    protected static final int BORDER_TOP = 1;
    protected Line[] borders;
    protected TableCell[][] cells;

    public Table(int i10, int i11) {
        if (i10 < 1) {
            throw new IllegalArgumentException("The number of rows must be greater than 1");
        }
        if (i11 >= 1) {
            this.cells = (TableCell[][]) Array.newInstance(TableCell.class, i10, i11);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < this.cells.length; i14++) {
                i12 = 0;
                int i15 = 0;
                while (true) {
                    TableCell[] tableCellArr = this.cells[i14];
                    if (i15 < tableCellArr.length) {
                        tableCellArr[i15] = new TableCell(this);
                        this.cells[i14][i15].setAnchor(new Rectangle(i12, i13, 100, 40));
                        i12 += 100;
                        i15++;
                    }
                }
                i13 += 40;
            }
            setAnchor(new Rectangle(0, 0, i12, i13));
            EscherContainerRecord escherContainerRecord = (EscherContainerRecord) getSpContainer().getChild(0);
            EscherOptRecord escherOptRecord = new EscherOptRecord();
            escherOptRecord.setRecordId(EscherTertiaryOptRecord.RECORD_ID);
            escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GROUPSHAPE__TABLEPROPERTIES, 1));
            EscherArrayProperty escherArrayProperty = new EscherArrayProperty((short) 17312, false, null);
            escherArrayProperty.setSizeOfElements(4);
            escherArrayProperty.setNumberOfElementsInArray(i10);
            escherArrayProperty.setNumberOfElementsInMemory(i10);
            escherOptRecord.addEscherProperty(escherArrayProperty);
            List<EscherRecord> childRecords = escherContainerRecord.getChildRecords();
            childRecords.add(childRecords.size() - 1, escherOptRecord);
            escherContainerRecord.setChildRecords(childRecords);
            return;
        }
        throw new IllegalArgumentException("The number of columns must be greater than 1");
    }

    private Line cloneBorder(Line line) {
        Line createBorder = createBorder();
        createBorder.setLineWidth(line.getLineWidth());
        createBorder.setLineStyle(line.getLineStyle());
        createBorder.setLineDashing(line.getLineDashing());
        createBorder.setLineColor(line.getLineColor());
        return createBorder;
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public void afterInsert(Sheet sheet) {
        TableCell[][] tableCellArr;
        super.afterInsert(sheet);
        EscherArrayProperty escherArrayProperty = (EscherArrayProperty) ((EscherOptRecord) a.f(((EscherContainerRecord) getSpContainer().getChild(0)).getChildRecords(), -2)).getEscherProperty(1);
        int i10 = 0;
        while (true) {
            if (i10 < this.cells.length) {
                byte[] bArr = new byte[4];
                LittleEndian.putInt(bArr, (int) ((tableCellArr[i10][0].getAnchor().height * 576) / 72.0f));
                escherArrayProperty.setElement(i10, bArr);
                int i11 = 0;
                while (true) {
                    TableCell[] tableCellArr2 = this.cells[i10];
                    if (i11 < tableCellArr2.length) {
                        TableCell tableCell = tableCellArr2[i11];
                        addShape(tableCell);
                        Shape borderTop = tableCell.getBorderTop();
                        if (borderTop != null) {
                            addShape(borderTop);
                        }
                        Shape borderRight = tableCell.getBorderRight();
                        if (borderRight != null) {
                            addShape(borderRight);
                        }
                        Shape borderBottom = tableCell.getBorderBottom();
                        if (borderBottom != null) {
                            addShape(borderBottom);
                        }
                        Shape borderLeft = tableCell.getBorderLeft();
                        if (borderLeft != null) {
                            addShape(borderLeft);
                        }
                        i11++;
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public Line createBorder() {
        Line line = new Line(this);
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(line.getSpContainer(), -4085);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.GEOMETRY__SHAPEPATH, -1);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.GEOMETRY__FILLOK, -1);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.SHADOWSTYLE__SHADOWOBSURED, 131072);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.THREED__LIGHTFACE, 524288);
        return line;
    }

    public TableCell getCell(int i10, int i11) {
        return this.cells[i10][i11];
    }

    public int getNumberOfColumns() {
        return this.cells[0].length;
    }

    public int getNumberOfRows() {
        return this.cells.length;
    }

    public Line[] getTableBorders() {
        return this.borders;
    }

    public void initTable() {
        Shape[] shapes = getShapes();
        Arrays.sort(shapes, new Comparator() { // from class: lib.zj.office.fc.hslf.model.Table.1
            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                Rectangle anchor = ((Shape) obj).getAnchor();
                Rectangle anchor2 = ((Shape) obj2).getAnchor();
                int i10 = anchor.f20689y - anchor2.f20689y;
                if (i10 == 0) {
                    return anchor.f20688x - anchor2.f20688x;
                }
                return i10;
            }
        });
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = -1;
        ArrayList arrayList3 = null;
        int i11 = 0;
        for (int i12 = 0; i12 < shapes.length; i12++) {
            Shape shape = shapes[i12];
            if (shape instanceof TextShape) {
                int i13 = shape.getAnchor().f20689y;
                if (i13 != i10) {
                    arrayList3 = new ArrayList();
                    arrayList.add(arrayList3);
                    i10 = i13;
                }
                arrayList3.add(shapes[i12]);
                i11 = Math.max(i11, arrayList3.size());
            } else if (shape instanceof Line) {
                arrayList2.add(shape);
            }
        }
        this.cells = (TableCell[][]) Array.newInstance(TableCell.class, arrayList.size(), i11);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ArrayList arrayList4 = (ArrayList) arrayList.get(i14);
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                TextShape textShape = (TextShape) arrayList4.get(i15);
                this.cells[i14][i15] = new TableCell(textShape.getSpContainer(), getParent());
                this.cells[i14][i15].setSheet(textShape.getSheet());
            }
        }
        this.borders = new Line[arrayList2.size()];
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            this.borders[i16] = (Line) arrayList2.get(i16);
        }
    }

    public void setAllBorders(Line line) {
        for (int i10 = 0; i10 < this.cells.length; i10++) {
            int i11 = 0;
            while (true) {
                TableCell[] tableCellArr = this.cells[i10];
                if (i11 < tableCellArr.length) {
                    TableCell tableCell = tableCellArr[i11];
                    tableCell.setBorderTop(cloneBorder(line));
                    tableCell.setBorderLeft(cloneBorder(line));
                    if (i11 == this.cells[i10].length - 1) {
                        tableCell.setBorderRight(cloneBorder(line));
                    }
                    if (i10 == this.cells.length - 1) {
                        tableCell.setBorderBottom(cloneBorder(line));
                    }
                    i11++;
                }
            }
        }
    }

    public void setColumnWidth(int i10, int i11) {
        int i12 = 0;
        int i13 = i11 - this.cells[0][i10].getAnchor().width;
        while (true) {
            TableCell[][] tableCellArr = this.cells;
            if (i12 < tableCellArr.length) {
                Rectangle anchor = tableCellArr[i12][i10].getAnchor();
                anchor.width = i11;
                this.cells[i12][i10].setAnchor(anchor);
                if (i10 < this.cells[i12].length - 1) {
                    int i14 = i10 + 1;
                    while (true) {
                        TableCell[] tableCellArr2 = this.cells[i12];
                        if (i14 < tableCellArr2.length) {
                            Rectangle anchor2 = tableCellArr2[i14].getAnchor();
                            anchor2.f20688x += i13;
                            this.cells[i12][i14].setAnchor(anchor2);
                            i14++;
                        }
                    }
                }
                i12++;
            } else {
                Rectangle anchor3 = getAnchor();
                anchor3.width += i13;
                setAnchor(anchor3);
                return;
            }
        }
    }

    public void setInsideBorders(Line line) {
        for (int i10 = 0; i10 < this.cells.length; i10++) {
            int i11 = 0;
            while (true) {
                TableCell[] tableCellArr = this.cells[i10];
                if (i11 < tableCellArr.length) {
                    TableCell tableCell = tableCellArr[i11];
                    if (i11 != tableCellArr.length - 1) {
                        tableCell.setBorderRight(cloneBorder(line));
                    } else {
                        tableCell.setBorderLeft(null);
                        tableCell.setBorderLeft(null);
                    }
                    if (i10 != this.cells.length - 1) {
                        tableCell.setBorderBottom(cloneBorder(line));
                    } else {
                        tableCell.setBorderTop(null);
                        tableCell.setBorderBottom(null);
                    }
                    i11++;
                }
            }
        }
    }

    public void setOutsideBorders(Line line) {
        for (int i10 = 0; i10 < this.cells.length; i10++) {
            int i11 = 0;
            while (true) {
                TableCell[] tableCellArr = this.cells[i10];
                if (i11 < tableCellArr.length) {
                    TableCell tableCell = tableCellArr[i11];
                    if (i11 == 0) {
                        tableCell.setBorderLeft(cloneBorder(line));
                    }
                    if (i11 == this.cells[i10].length - 1) {
                        tableCell.setBorderRight(cloneBorder(line));
                    } else {
                        tableCell.setBorderLeft(null);
                        tableCell.setBorderLeft(null);
                    }
                    if (i10 == 0) {
                        tableCell.setBorderTop(cloneBorder(line));
                    } else if (i10 == this.cells.length - 1) {
                        tableCell.setBorderBottom(cloneBorder(line));
                    } else {
                        tableCell.setBorderTop(null);
                        tableCell.setBorderBottom(null);
                    }
                    i11++;
                }
            }
        }
    }

    public void setRowHeight(int i10, int i11) {
        int i12 = i11 - this.cells[i10][0].getAnchor().height;
        for (int i13 = i10; i13 < this.cells.length; i13++) {
            int i14 = 0;
            while (true) {
                TableCell[] tableCellArr = this.cells[i13];
                if (i14 < tableCellArr.length) {
                    Rectangle anchor = tableCellArr[i14].getAnchor();
                    if (i13 == i10) {
                        anchor.height = i11;
                    } else {
                        anchor.f20689y += i12;
                    }
                    this.cells[i13][i14].setAnchor(anchor);
                    i14++;
                }
            }
        }
        Rectangle anchor2 = getAnchor();
        anchor2.height += i12;
        setAnchor(anchor2);
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public void setSheet(Sheet sheet) {
        super.setSheet(sheet);
        if (this.cells == null) {
            initTable();
        }
    }

    public Table(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }
}
