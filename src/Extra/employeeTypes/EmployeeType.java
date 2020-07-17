package Extra.employeeTypes;

public enum EmployeeType {
    FullStack((byte) 3), FrontEnd((byte) 4), BackEnd((byte) 5), NetworkSecurityExpert((byte) 2), DBExpert((byte) 1);
     private final byte value;

    EmployeeType(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
}
