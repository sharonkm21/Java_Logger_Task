package JAVA8_Homestasks.InterfaceAndStreams;

public class Response
{
    private String responseBody;
    private int statusCode;
    private String responseType;

    public Response(String responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getResponseType() {
        return responseType;
    }

    @Override
    public String toString() {
        return "Response{responseBody='" + responseBody + "', statusCode=" + statusCode + ", responseType='" + responseType + "'}";
    }
}
