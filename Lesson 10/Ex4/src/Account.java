class Account {
    private long balance;
    private String ownerName;
    private boolean locked;

    public long getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return locked;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setBalance(long value) {
        balance = value;
    }

    public void setOwnerName(String value) {
        ownerName = value;
    }

    public void setLocked(boolean value) {
        locked = value;

    }
}