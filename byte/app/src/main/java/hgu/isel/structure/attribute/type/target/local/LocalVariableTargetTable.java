package hgu.isel.structure.attribute.type.target.local;

public class LocalVariableTargetTable {
    private byte[] startPC; // u2
    private byte[] length; // u2
    private byte[] index; // u2

    public byte[] getStartPC() {
        return startPC;
    }

    public void setStartPC(byte[] startPC) {
        this.startPC = startPC;
    }

    public byte[] getLength() {
        return length;
    }

    public void setLength(byte[] length) {
        this.length = length;
    }

    public byte[] getIndex() {
        return index;
    }

    public void setIndex(byte[] index) {
        this.index = index;
    }

    public LocalVariableTargetTable(byte[] startPC, byte[] length, byte[] index) {
        this.startPC = startPC;
        this.length = length;
        this.index = index;
    }
}
