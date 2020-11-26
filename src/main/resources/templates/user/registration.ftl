<#import  "../common/page.ftl" as common>

<@common.page>
<div class="row">
    <div class="col-3"></div>

    <div class="col">
        <form action="/user/registration" method="post">

            <div>
                <label for="username">Username:</label>
                <input type="text" class="form-control" aria-describedby="usernameHelp" name="username">
                <small id="usernameHelp" class="form-text text-muted">We'll never share your username with anyone
                    else.</small>
            </div>

            <div>
            <label for="password">Password</label>
            <input type="password" class="form-control" aria-describedby="usernameHelp"  name="password">
                <small id="usernameHelp" class="form-text text-muted">Your password will be encrypted.</small>
            </div>


            <div>
            <label for="email">Email</label>
            <input type="email" class="form-control" aria-describedby="usernameHelp" name="email">
                <small id="usernameHelp" class="form-text text-muted">We'll never share your email with anyone
                    else.</small>
            </div>


            <div>
            <label for="phone">phone:</label>
            <input type="text"class="form-control" aria-describedby="usernameHelp" name="phone">
                <small id="usernameHelp" class="form-text text-muted">Your privacy will be protected</small>
            </div>

            <div>
            <label for="address">Address:</label>
            <input type="text" class="form-control" placeholder="country town street building " name="address">
            </div>

            <div>
            <label for="firstName">First Name:</label>
            <input type="text" class="form-control" name="firstName">
            </div>

            <div>
            <label for="lastname">Last Name:</label>
            <input type="text" class="form-control"  name="lastName">
            </div><br>

            <div>
                <button type="submit" class="btn btn-primary btn-block">Registration</button>
            </div>


        </form>
    </div>

    <div class="col-3"></div>
</div>
<div>
    </@common.page>




