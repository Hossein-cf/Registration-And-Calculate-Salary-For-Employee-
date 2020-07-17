package Extra;

public enum Gender {
    Male((byte)1), Female((byte)2);
    private final byte value;

    Gender(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
}
