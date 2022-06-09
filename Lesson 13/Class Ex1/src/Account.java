public class Account {
  private long id;
  private String code;
  private Long balance;

  public Account(long id, String code, Long balance) {
    this.id = id;
    this.code = code;
    this.balance = balance;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Account{id=" + id +
            ", code='" + code + '\'' +
            ", balance=" + balance + '}';
  }
}