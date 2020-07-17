package Extra;

public enum ELevelOfEducation {
    Diploma((byte)1),Bachelor((byte)2),MA((byte)3);
    private final byte value;

    ELevelOfEducation(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
}
