package Extra;

import javafx.scene.image.Image;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class DBHelper {
    private Connection connection;
    private Statement statement;

    // CONNECTION AND CLOSED THE DAB ////////////////////////////////////////
    private boolean isConnectionToTheDB() {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=EmployeeInWebApp;integratedSecurity=true;";
            connection = DriverManager.getConnection(connectionUrl);
            statement = connection.createStatement();
            System.out.println("Connection to DataBase");
            return true;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());

        }
        return false;
    }

    private boolean isClosedTheDB() {
        try {
            statement.close();
            connection.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    // INSERT TO THE DB//////////////////////////////////////
    public boolean insertEmployee(Employee employee) {
        Person person = employee;

        int IDPerson = insertPerson(person);
        int IDJobInformation = insertJobInformation(employee.getJobInformation());
        int IDSalaryInformation = insertSalaryInformation(employee.getSalaryInformation());

        isConnectionToTheDB();
        String query = "INSERT INTO [dbo].[tblEmployee]( [IDPrerson], [IDJobInformation], [IDSalaryInformation], [EmployeeNumber],EmployeeLevel) VALUES ('" + IDPerson + "','" + IDJobInformation + "','" + IDSalaryInformation + "','" + employee.getEmployeeNumber() + "','" + employee.getEmployeeLevel() + "');";
        isConnectionToTheDB();
        try {
            statement.executeUpdate(query);
            isClosedTheDB();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage() + "  Insert Employee");

        }
        isClosedTheDB();
        return false;
    }

    private int insertPerson(Person person) {
        String query = "INSERT INTO tblPersonalInformation ( [Name], [LastName], [FatherName], [NationalNumber], [BornPlace], [BornTime1], [Address], [PostalCode], [PhoneNumber], [HomePhoneNumber], [Marriage], [Gender], [NumberOfChildren],[BornTime])VALUES ('" + person.getName() + "','" + person.getLastName() + "','" + person.getFatherName() + "','" + person.getNationalNumber() + "','" + person.getBirthPlace() + "','" + person.getBirthTime() + "','" + person.getAddress() + "','" + person.getPostalCode() + "','" + person.getPhoneNumber() + "','" + person.getHomePhoneNumber() + "','" + person.isMarriage() + "','" + person.getGender() + "','" + person.getNumberOfChild() + "','" + new Date(2, 2, 2) + "'); ";
        isConnectionToTheDB();
        int IDPerson = 0;
        try {
            statement.executeUpdate(query);
            query = "SELECT ID from tblPersonalInformation where [NationalNumber] = '" + person.getNationalNumber() + "';";

            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
                IDPerson = resultSet.getInt("ID");
            isClosedTheDB();
            return IDPerson;
        } catch (SQLException e) {
            System.err.println(e.getMessage() + "INSERT  PERSON");

        }
        isClosedTheDB();
        return 0;
    }

    private int insertJobInformation(JobInformation jobInformation) {
        int count = 0;
        String query = "INSERT INTO [dbo].[tblJobInformation]( [Certification], [WorkExperience], [EmployeeType], [Skills]) VALUES ('" + jobInformation.getCertification() + "','" + jobInformation.getExperience() + "','" + jobInformation.getEmployeeType() + "','" + jobInformation.getSkills() + "');";
        isConnectionToTheDB();
        try {
            statement.executeUpdate(query);
            query = "SELECT * FROM [dbo].[tblJobInformation]";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
                count++;
            isClosedTheDB();
            return count;
        } catch (SQLException e) {
            System.err.println(e.getMessage() + "  INSERT JOB INFORMATION");
        }
        isClosedTheDB();
        return 0;
    }

    private int insertSalaryInformation(SalaryInformation salaryInformation) {
        String query = "INSERT INTO [dbo].[tblSalaryInformation] ( [Morningwork], [AfternoonWork], [NightWork], [BaseSalary],FullTime)VALUES ('" + salaryInformation.isMorningWorking() + "','" + salaryInformation.isAfternoonWorking() + "','" + salaryInformation.isNightWorking() + "','" + salaryInformation.getBaseSalary() + "','" + salaryInformation.isFullTimeWorking() + "');";
        int count = 0;
        isConnectionToTheDB();
        try {
            statement.executeUpdate(query);
            query = "SELECT * FROM [dbo].[tblSalaryInformation] ";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
                count++;
            isClosedTheDB();
            return count;
        } catch (SQLException e) {
            System.err.println(e.getMessage() + " INSERT SALARY INFORMATION");
        }
        isClosedTheDB();
        return 0;
    }

    public boolean insertReceipt(Receipt receipt, String EmployeeNumber) {
        isConnectionToTheDB();
        String query = "INSERT INTO [dbo].[tblReceipt]([IDEmployee], [FinalSalary], [RightToHousing], [Insurance], [Tax], [WorkTime], [OverTimeWork], [Premium], [Date], [Condition],[Serial], [yearSalary], [deductedAmount]) VALUES ('" + getIDEmployee(EmployeeNumber) + "','" + receipt.getFinalSalary() + "','" + receipt.getRightToHousing() + "','" + receipt.getInsurance() + "','" + receipt.getTax() + "','" + receipt.getWorkTime() + "','" + receipt.getOverWorkTime() + "','" + receipt.getPremium() + "','" + receipt.getDate() + "','" + receipt.isCondition() + "','" + receipt.getSerial() + "','" + receipt.getYearSalary() + "','" + receipt.getDeductedAmount() + "');";
        try {
            statement.executeUpdate(query);
            isClosedTheDB();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage() + "  INSERT RECEIPT");
        }

        isClosedTheDB();
        return false;
    }

    public boolean insertDailyRecord(DailyRecords dailyRecords, String EmployeeNumber) {
        isConnectionToTheDB();
        try {
            String query = "INSERT INTO[dbo].[tblDailyRecord]( [IDEmployee], [WorkTime], [EnterTime], [ExitTime], [OverTimeWork], [StartOverTimeWork], [EndOverTmeWork], [HolidayWorkTime])VALUES('" + getIDEmployee(EmployeeNumber) + "','" + dailyRecords.getWorkTime() + "','" + dailyRecords.getEnterTime() + "','" + dailyRecords.getExitTime() + "','" + dailyRecords.getOverworkTime() + "','" + dailyRecords.getStartOverWorkTime() + "','" + dailyRecords.getEndOverWorkTime() + "','" + dailyRecords.getHolidayWorkTime() + "');";

            statement.executeUpdate(query);
            isClosedTheDB();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "  INSERT DAILY RECORDS");
        }
        isClosedTheDB();
        return false;
    }

    private int getIDEmployee(String EmployeeNumber) {
        isConnectionToTheDB();
        String query1 = "SELECT ID FROM [dbo].[tblEmployee]  where EmployeeNumber ='" + EmployeeNumber + "';";
        try {
            ResultSet resultSet = statement.executeQuery(query1);
            if (resultSet.next())
                return resultSet.getInt("ID");
        } catch (SQLException e) {
            System.err.println(e.getMessage() + "GET EMPLOYEE ID");
        }
        return 0;
    }

    // READ TO THE DB//////////////////////////////////////////////////////////////////////////////////////////
    public Employee readEmployee(String EmployeeNumber) {
        Employee employee = new Employee();

        String query = "SELECT * FROM tblEmployee WHERE EmployeeNumber ='" + EmployeeNumber + "';";
        isConnectionToTheDB();

        try {
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Person person = readPerson(resultSet.getInt("IDPrerson"));
                employee = (Employee) person;
                employee.setJobInformation(readJobInformation(resultSet.getInt("IDJobInformation")));
                employee.setSalaryInformation(readSalaryInformation(resultSet.getInt("IDSalaryInformation")));
                isConnectionToTheDB();
                employee.setEmployeeLevel(resultSet.getString("EmployeeLevel"));
                employee.setEmployeeNumber(EmployeeNumber);
            }
            isClosedTheDB();
            return employee;

        } catch (SQLException e) {
            System.out.println(e.getMessage() + "READ EMPLOYEE");
        }
        isClosedTheDB();
        return null;
    }

    private Person readPerson(int ID) {
        Person person = new Employee();

        String query = "SELECT * FROM [dbo].[tblPersonalInformation] WHERE ID ='" + ID + "';";
        isConnectionToTheDB();
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
//                byte[] image = resultSet.getBytes("Image");
//                OutputStream targetFile = new FileOutputStream("../src/Files/profileImage.jpg");
//                targetFile.write(image);
//                targetFile.close();
                person.setName(resultSet.getString("Name"));
                person.setLastName(resultSet.getString("LastName"));
                person.setFatherName(resultSet.getString("FatherName"));
                person.setAddress(resultSet.getString("Address"));
                person.setPhoneNumber(resultSet.getString("PhoneNumber"));
                person.setPostalCode(resultSet.getString("PostalCode"));
                person.setNationalNumber(resultSet.getLong("NationalNumber"));
                person.setBirthPlace(resultSet.getString("BornPlace"));
                person.setBirthTime(resultSet.getString("BornTime1"));
                person.setHomePhoneNumber(resultSet.getString("HomePhoneNumber"));
                person.setMarriage(resultSet.getBoolean("Marriage"));
                person.setGender(resultSet.getString("Gender"));
                person.setNumberOfChild(resultSet.getInt("NumberOfChildren"));
//                person.setProfileImage(new Image("./Files/profileImage.jpg"));
            }
            isClosedTheDB();
            return person;

        } catch (SQLException e) {
            System.out.println(e.getMessage() + "READ Person");
        }
        isClosedTheDB();
        return null;
    }

    private JobInformation readJobInformation(int ID) {
        JobInformation jobInformation = new JobInformation();
        String query = "SELECT * FROM tblJobInformation where ID='" + ID + "';";
        try {
            isConnectionToTheDB();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                jobInformation.setCertification(resultSet.getString("Certification"));
                jobInformation.setEmployeeType(resultSet.getString("EmployeeType"));
                jobInformation.setExperience(resultSet.getInt("WorkExperience"));
                jobInformation.setSkills(resultSet.getString("Skills"));

            }
            isClosedTheDB();

            return jobInformation;
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "READ EMPLOYEE");
        }
        isClosedTheDB();

        return null;
    }

    public ArrayList<JobInformation> readJobInformation() {
        ArrayList<JobInformation> list = new ArrayList<>();

        String query = "SELECT * FROM tblJobInformation ;";
        try {
            isConnectionToTheDB();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                JobInformation jobInformation = new JobInformation();
                jobInformation.setCertification(resultSet.getString("Certification"));
                jobInformation.setEmployeeType(resultSet.getString("EmployeeType"));
                jobInformation.setExperience(resultSet.getInt("WorkExperience"));
                jobInformation.setSkills(resultSet.getString("Skills"));
                list.add(jobInformation);
            }
            isClosedTheDB();

            return list;
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "READ EMPLOYEE");
        }
        isClosedTheDB();

        return null;
    }

    private SalaryInformation readSalaryInformation(int ID) {
//[ID], [], [], [], []
        SalaryInformation salaryInformation = new SalaryInformation();
        String query = "SELECT * FROM  tblSalaryInformation WHERE ID ='" + ID + "';";
        isConnectionToTheDB();
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                salaryInformation.setAfternoonWorking(resultSet.getBoolean("AfternoonWork"));
                salaryInformation.setBaseSalary(resultSet.getString("BaseSalary"));
                salaryInformation.setMorningWorking(resultSet.getBoolean("MorningWork"));
                salaryInformation.setNightWorking(resultSet.getBoolean("NightWork"));
                salaryInformation.setFullTimeWorking(resultSet.getBoolean("FullTime"));
            }
            isClosedTheDB();
            return salaryInformation;

        } catch (SQLException e) {
            System.out.println(e.getMessage() + "READ EMPLOYEE");
        }
        isClosedTheDB();

        return null;
    }

    public ArrayList<Receipt> readReceipt(String employeeNumber) {
        ArrayList<Receipt> receipts = new ArrayList<>();
        String query = "SELECT * FROM tblReceipt WHERE IDEmployee = '" + getIDEmployee(employeeNumber) + "'; ";

        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Receipt receipt = new Receipt();
                receipt.setFinalSalary(resultSet.getString("FinalSalary"));
                receipt.setRightToHousing(resultSet.getString("RightToHousing"));
                receipt.setInsurance(resultSet.getString("Insurance"));
                receipt.setTax(resultSet.getString("Tax"));
                receipt.setCondition(resultSet.getBoolean("Condition"));
                receipt.setWorkTime(resultSet.getString("WorkTime"));
                receipt.setOverWorkTime(resultSet.getString("OverTimeWork"));
                receipt.setPremium(resultSet.getString("Premium"));
                receipt.setDate(LocalDate.parse(resultSet.getString("Date")));
                receipt.setSerial(resultSet.getLong("Serial"));
//                [Serial], [yearSalary], [deductedAmount]
                receipt.setYearSalary(resultSet.getString("yearSalary"));
                receipt.setDeductedAmount(resultSet.getString("deductedAmount"));
                receipts.add(receipt);


            }
            isClosedTheDB();
            return receipts;

        } catch (SQLException e) {
            System.out.println(e.getMessage() + "READ EMPLOYEE");
        }
        isClosedTheDB();
        return null;
    }

    public ArrayList<DailyRecords> readDailyRecord(String employeeNumber) {

        ArrayList<DailyRecords> dailyRecords = new ArrayList<>();
        String query = "SELECT * FROM [dbo].[tblDailyRecord] WHERE IDEmployee = '" + getIDEmployee(employeeNumber) + "';";
        isConnectionToTheDB();
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                DailyRecords dailyRecord = new DailyRecords();

                dailyRecord.setEnterTime(LocalDate.parse(resultSet.getString("EnterTime")));
                dailyRecord.setWorkTime(resultSet.getString("WorkTime"));
                dailyRecord.setExitTime(LocalDate.parse(resultSet.getString("ExitTime")));
                dailyRecord.setOverworkTime(resultSet.getString("OverTimeWork"));
                dailyRecord.setStartOverWorkTime(LocalDate.parse(resultSet.getString("StartOverTimeWork")));
                dailyRecord.setEndOverWorkTime(LocalDate.parse(resultSet.getString("EndOverTmeWork")));
                dailyRecord.setHolidayWorkTime(resultSet.getString("HolidayWorkTime"));
                dailyRecords.add(dailyRecord);


            }
            isClosedTheDB();

            return dailyRecords;

        } catch (SQLException e) {
            System.out.println(e.getMessage() + "READ EMPLOYEE");
        }
        isClosedTheDB();
        return null;
    }

    // UPDATE TO THE DB//////////////////////////////////////////////////////////////////////////////////////////
    public boolean updateEmployee(Employee employee) {
        String query = "SELECT * from tblEmployee where EmployeeNumber = '" + employee.getEmployeeNumber() + "';";
        int IDPerson = 0;
        int IDJobInformation = 0;
        int IDSalaryInformation = 0;

        JobInformation jobInformation = employee.getJobInformation();
        SalaryInformation salaryInformation = employee.getSalaryInformation();
        Person person = employee;
        isConnectionToTheDB();
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                IDPerson = resultSet.getInt("IDPerson");
                IDJobInformation = resultSet.getInt("IDJobInformation");
                IDSalaryInformation = resultSet.getInt("IDSalaryInformation");

            }
            updatePerson(person, IDPerson);
            updateJobInformation(jobInformation, IDJobInformation);
            updateSalaryInformation(salaryInformation, IDSalaryInformation);
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "  UPDATE EMPLOYEE");
        }

        return false;
    }

    private boolean updatePerson(Person person, int ID) {
        String query = "UPDATE tblEmployee set [Name] = '" + person.getName() + "', [LastName]='" + person.getLastName() + "', [FatherName]='" + person.getFatherName() + "', [NamtionalNumber]='" + person.getNationalNumber() + "', [BornPlace]='" + person.getBirthPlace() + "', [BornTime1]='" + person.getBirthTime() + "', [Address]='" + person.getAddress() + "', [PostalCode]='" + person.getPostalCode() + "', [PhoneNumber]='" + person.getPhoneNumber() + "', [HomePhoneNumber]='" + person.getHomePhoneNumber() + "', [Marriage]='" + person.isMarriage() + "', [Gender]='" + person.getGender() + "', [NumberOfChidren]='" + person.getNumberOfChild() + "';";
        isConnectionToTheDB();
        try {
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "  UPDATE EMPLOYEE");
        }

        return false;
    }

    private boolean updateJobInformation(JobInformation jobInformation, int ID) {

        String query = "UPDATE tblEmployee set [Certification] = '" + jobInformation.getCertification() + "', [WorkExperience] = '" + jobInformation.getExperience() + "', [EmployeeType] ='" + jobInformation.getEmployeeType() + "', [Skills] = '" + jobInformation.getSkills() + "' WHERE ID = '" + ID + "'; ";
        isConnectionToTheDB();
        try {
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "  UPDATE EMPLOYEE");
        }

        return false;
    }

    private int updateSalaryInformation(SalaryInformation salaryInformation, int ID) {
        String query = "UPDATE tblEmployee set [Morningwork] = '" + salaryInformation.isMorningWorking() + "', [AfternoonWork]='" + salaryInformation.isAfternoonWorking() + "', [NightWork]='" + salaryInformation.isNightWorking() + "', [BaseSalary]='" + salaryInformation.getBaseSalary() + "' where ID = '" + ID + "';";
        isConnectionToTheDB();
        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "  UPDATE EMPLOYEE");
        }


        return 0;
    }

    public boolean updateReceipt(Receipt receipt, String EmployeeNumber, LocalDate localDate) {
        int EmployeeID = getIDEmployee(EmployeeNumber);
        String query = "UPDATE tblEmployee set  [FinalSalary]='" + receipt.getFinalSalary() + "', [RightToHousing]='" + receipt.getRightToHousing() + "', [Insurance]='" + receipt.getInsurance() + "', [Tax]='" + receipt.getTax() + "', [WorkTime]='" + receipt.getWorkTime() + "', [OverTimeWork]='" + receipt.getOverWorkTime() + "', [Premium]='" + receipt.getPremium() + "', [Date]='" + receipt.getDate() + "', [Condition] ='" + receipt.isCondition() + "' WHERE IDEmployee = '" + EmployeeID + "';";
        isConnectionToTheDB();
        try {
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "  UPDATE EMPLOYEE");
        }

        return false;
    }

    public boolean updateDailyRecord(DailyRecords dailyRecords, String EmployeeNumber, LocalDate localDate) {
        int EmployeeId = getIDEmployee(EmployeeNumber);
        String query = "UPDATE tblEmployee set  [WorkTime]='" + dailyRecords.getWorkTime() + "', [EnterTime]='" + dailyRecords.getEnterTime() + "', [ExitTime]='" + dailyRecords.getExitTime() + "', [OverTimeWork]='" + dailyRecords.getOverworkTime() + "', [StartOverTimeWork]='" + dailyRecords.getStartOverWorkTime() + "', [EndOverTmeWork]='" + dailyRecords.getEndOverWorkTime() + "', [HolidayWorkTime]='" + dailyRecords.getHolidayWorkTime() + "' WHERE IDEmployee = '" + EmployeeId + "'; ";
        isConnectionToTheDB();
        try {
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "  UPDATE EMPLOYEE");
        }

        return false;
    }


}
