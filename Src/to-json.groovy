import groovy.json.JsonOutput;
import groovy.json.StringEscapeUtils;

def invoke(msg) {
    def jsonString = StringEscapeUtils.unescapeJava(JsonOutput.toJson(msg.get("user")))
    msg.put("user", jsonString);
    return true;
}
