import org.json.JSONObject;

public interface AnalyserCom {
    JSONObject reciver();
    void send(JSONObject data);
}