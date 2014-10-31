<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script>
            $(document).ready(function(){
                printConfig(1);
                printConfig(2);
                return false;
            });
            function printConfig(i) {
                $.get('config/'+i, function(data) {
                    var prettyjson = JSON.stringify(data, undefined, 3);
                    $('#config'+i).html(prettyjson);
                });
            }
        </script>
    </head>
    <body>
        <h2>${message}</h2>
        <h3>Configuration</h3>
        <h4>Module 1:</h4>
        <pre id="config1"></pre>
        <h4>Module 2:</h4>
        <pre id="config2"></pre>

</html>
