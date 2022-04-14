package json.homework;

import java.util.List;

public class Root {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Boolean getTest() {
        return test;
    }

    public void setTest(Boolean test) {
        this.test = test;
    }

    public List<PagesNumbers> getPagesNumbers() {
        return pagesNumbers;
    }

    public void setPagesNumbers(List<PagesNumbers> pagesNumbers) {
        this.pagesNumbers = pagesNumbers;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public List<Pages> getPages() {
        return pages;
    }

    public void setPages(List<Pages> pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", test=" + test +
                ", pagesNumbers=" + pagesNumbers +
                ", users=" + users +
                ", pages=" + pages +
                '}';
    }

    private String name;
    private Long count;
    private Boolean test;
    private List<PagesNumbers> pagesNumbers;
    private List<Users> users;
    private List<Pages> pages;
}
