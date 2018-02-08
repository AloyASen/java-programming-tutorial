

public interface Kingdom {
    public String ruler();
    public void getMessage(Kingdom sender, String message);
    public void setAlly(Kingdom alliegience);
    public Kingdom getAlly();
    /**
     * this method is only implemented in the southeros subkingdom of the country
     */
}
