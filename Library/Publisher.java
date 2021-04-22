package Library;

public class Publisher 
{
    private String publisherName, date, description;

    public Publisher(String publisherName, String date, String description )
    {
        this.publisherName = publisherName;
        this.date = date;
        this.description = description;
    }

    public String getPublisherName()
    {
        return this.publisherName;
    }
    public String getPublisherDate()
    {
        return this.date;
    }

    public String getPublisherDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}


