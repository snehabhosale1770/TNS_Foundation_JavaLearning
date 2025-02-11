public class P18constructor {
    private String custName;
    private int custId;
    private String custCity;

    public P18constructor() {
        System.out.println("Default Constructor ...");
    }

    public P18constructor(String custName, int custId, String custCity) {
        this.custName = custName;
        this.custId = custId;
        this.custCity = custCity;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    @Override
    public String toString() {
        return "P17Constructor{" +
                "custName='" + custName + '\'' +
                ", custId=" + custId +
                ", custCity='" + custCity + '\'' +
                '}';
    }

    public static void main(String[] args) {
        P18constructor P=new P18constructor();
        P.setCustCity("Solapur");
        P.setCustId(2);
        P.setCustName("Vaishali");
        System.out.println(P);
        P18constructor P2=new P18constructor("Sneha",1,"Pune");
        System.out.println(P2.toString());
    }
}