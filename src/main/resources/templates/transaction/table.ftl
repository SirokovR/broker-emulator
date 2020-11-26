<#import "../common/page.ftl" as common>

<@common.page>

    <h2>Trades Transactons:</h2>

    <table class="table table-striped">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Sticker</th>
            <th scope="col">Amount</th>
            <th scope="col">Price</th>

        </tr>
        </thead>

        <#list transactions as transaction>
            <tr>
                <th scope="row">${transaction.sticker}</th>
                <td>${transaction.amount}</td>
                <td>${transaction.price}</td>

            </tr>
        </#list>
    </table>
</@common.page>