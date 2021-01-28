package Task03_03;

public abstract class Message<M>{
    private String from;
    private String to;
    private M content;

    public Message(String from, String to, M content){
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getFrom(){
        return from;
    }
    public String getTo(){
        return to;
    }
    public M getContent(){
        return content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", content=" + content +
                '}';
    }
}
