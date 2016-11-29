import groovy.json.JsonOutput;

def invoke(msg) {
    msg.put("user", JsonOutput.toJson(msg.get("user")));
    return true;
}
