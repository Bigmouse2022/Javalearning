<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>salary</title>
</head>
<body>
<table>
    <tr>
        <th>year</th>
        <th>salary</th>
    </tr>
<%
for(int i=0;i<50;i++){
    out.print("<tr>");
    out.print("<td>"+i+"</td>");
    int salary=0;
    if(i<=5){
        salary=1500+i*150;
    }else if(i>5&&i<=10){
        salary=1500+150*5+300*(i-5);
    }else if(i>10){
        salary=1500+150*5+300*5+375*(i-10);
    }
    out.print("<td>"+salary+"</td>");
    out.print("</tr>");
}
%>
</table>
</body>
</html>