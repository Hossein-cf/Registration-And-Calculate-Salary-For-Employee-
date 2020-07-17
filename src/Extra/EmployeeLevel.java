package Extra;

public enum EmployeeLevel {
    Junior((byte) 1),Mid_level((byte)2),Senior((byte)3);

    private final byte value;

    EmployeeLevel(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

}
