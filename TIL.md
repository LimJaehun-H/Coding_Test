2026/05/19

문자를 정수로
char c → int :  c - '0'

문자열을 정수로
String st -> Integer.parseInt(st)


정수를 문자열로
1. int a -> a+""
2. int a -> String.valueOf(a)
3. int a -> Integer.toString(a)

문자열('123435')을 하나씩 문자로 분리하기
String st -> st.toCharArray()

문자를 문자열로
char c -> String.valueOf(c)
