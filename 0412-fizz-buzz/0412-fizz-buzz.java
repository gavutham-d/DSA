class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        int i = 1, Fizz = 0, Buzz = 0;
        while(i<=n){
            Fizz++;Buzz++;
            if(Fizz==3 && Buzz==5){
                answer.add("FizzBuzz");
                Fizz=0;Buzz=0;
            }else if(Fizz==3){
                answer.add("Fizz");
                Fizz=0;
            }else if(Buzz==5){
                answer.add("Buzz");
                Buzz=0;
            }else answer.add(Integer.toString(i));
            i++;
        }
        return answer;
    }
}