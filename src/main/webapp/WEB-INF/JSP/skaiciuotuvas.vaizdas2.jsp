<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Skaičiuotuvas</title>
    </head>
    <body>
        <h2>Internetinis skaičiuotuvas. Galimos operacijos: sudėti, atimti, dauginti, dalinti</h2>
        <form method="" action="">
            Pirmas skaičius: <input type="number" name=""><p>
            Antras skaičius: <input type="number" name=""><p>
            Operacijos ženklas:
            <select name="">
                <option selected="selected" value="+">Sudėtis</option>
                <option value="-">Atimtis</option>
                <option value="*">Daugyba</option>
                <option value="/">Dalyba</option>
            </select><p>
            <input type="submit" value="skaičiuoti">
        </form>
    </body>
</html>
