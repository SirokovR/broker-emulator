<#import  "../common/page.ftl" as common>

<@common.page>

<form action="/login" method="post">

    <div>
        <label for="username">Username:</label><br>
        <input type="text" name="username"><br><br>

        <label for="password">Password</label><br>
        <input type="password" name="password"><br><br>
        <div>
            <input type="submit" value="login">
        </div>

    </div>

</form>
</@common.page>