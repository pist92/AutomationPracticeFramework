package json.homework.json;

public class Pages {

    public Pages(String title, String url, Boolean guests) {
        this.title = title;
        this.url = url;
        this.guests = guests;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getGuests() {
        return guests;
    }

    public void setGuests(Boolean guests) {
        this.guests = guests;
    }

    @Override
    public String toString() {
        return "Pages{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", guests=" + guests +
                '}';
    }

    private String title;
    private String url;
    private Boolean guests;


}



