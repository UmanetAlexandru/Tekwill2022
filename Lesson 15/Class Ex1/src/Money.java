import java.util.Objects;

public class Money {
  private int amount;
  private String currencyCode;

  public Money(int amount, String currencyCode) {
    this.amount = amount;
    this.currencyCode = currencyCode;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Money)) return false;
//    if (o == null || this.getClass() != o.getClass()) return false;
    Money money = (Money) o;
    return amount == money.amount &&
            Objects.equals(currencyCode, money.currencyCode);
  }

  @Override
  public int hashCode() {
    int result = 21;
    result = 31 * result + amount;
    result = 31 * result + (currencyCode == null ? 0 : currencyCode.hashCode());
    return result;
//    return Objects.hash(amount, currencyCode);
  }
}
//https://stackoverflow.com/questions/596462/any-reason-to-prefer-getclass-over-instanceof-when-generating-equals