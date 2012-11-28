package yury.graphics;

public enum MaritalStatus {Single("Sigle"), MarriedOneIncome("Married one income"), MarriedTwoIncomes("Married two incomes");
private final String display;
private MaritalStatus(String s) {
    display = s;
}
@Override
public String toString() {
    return display;
}
}
