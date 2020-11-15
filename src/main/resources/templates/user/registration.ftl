<#import  "../common/page.ftl" as common>

<@common.page>
<div class="row">
    <div class="col-3">col-left</div>

    <div class="col">
        <form action="/user/registration" method="post">

            <div>
                <label for="username">Username:</label>
                <input type="text" class="form-control" aria-describedby="usernameHelp" name="username">
                <small id="usernameHelp" class="form-text text-muted">We'll never share your username with anyone
                    else.</small>
            </div>

            <label for="password">Password</label>
            <input type="password" class="form-control"  name="password">


            <label for="email">Email</label>
            <input type="email" class="form-control"  name="email">


            <label for="phone">phone:</label>
            <input type="text" name="phone">

            <label for="address">Address:</label>
            <input type="text" name="address">

            <label for="firstName">First Name:</label>
            <input type="text" name="firstName">

            <label for="lastname">Last Name:</label>
            <input type="text" name="lastName">

            <div>
                <button type="submit" class="btn btn-primary">Registration</button>
            </div>


        </form>
    </div>

    <div class="col-3">col-right</div>
</div>
<div>
    </@common.page>




