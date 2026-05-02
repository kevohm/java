class Badge {
    public String print(Integer id, String name, String department) {
        String answer = "";
        if(id != null){
            answer += ("[" + id + "]");
        }
        if(id != null && name != null){
            answer += " - ";
        }
        if(name != null){
            answer += name + " - ";
        }
        if(department != null){
            answer += department.toUpperCase();
        }else{
            answer += "OWNER";
        }
        return answer;
    }
}
