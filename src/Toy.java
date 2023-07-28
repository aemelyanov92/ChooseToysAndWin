import java.util.UUID;

public class Toy {
    private UUID id;
    private String name;
    private Integer count;
    private Integer percent;

    public Toy(String name,Integer count,Integer percent){
        this.id = java.util.UUID.randomUUID();
        this.name = name;
        this.count = count;
        this.percent = percent;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}