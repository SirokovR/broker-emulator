
<#import "../common/page.ftl" as common>

<@common.page>


    <!-- Button trigger modal -->
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#staticBackdrop">
        Creat Trade Transaction
    </button>

    <!-- Modal -->
    <div class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
        <div class="modal-dialog">
            <form action="/transaction/create" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="staticBackdropLabel">Trade Transaction</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="sticker">Company Sticker</label>
                        <input type="text" class="form-control" aria-describedby="stickerHelp" name="sticker">
                        <small id="stickerHelp" class="form-text text-muted">Please enter Sticker</small>
                    </div>

                    <div class="form-group">
                        <label for="amount">Amount</label>
                        <input type="text" class="form-control" aria-describedby="stickerHelp" name="amount">
                        <small id="stickerHelp" class="form-text text-muted">Please enter Stock amountr</small>
                    </div>

                    <div class="form-group">
                        <label for="price">The Latest Close Price: ${price} USD</label>
                        <input type="number" class="form-control" name="price"/>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Save</button>
                </div>
            </div>
            </form>
        </div>

    </div>





    <h2>Trades Items:</h2>

    <table class="table table-striped">
        <thead class="thead-dark">
        <tr>
            <#--<th>Open</th>
            <th>High</th>-->
            <#--TODO.add another columns..-->

            <th scope="row">Period</th>
            <#--<th scope="col">sticker</th>-->
            <th scope="col">open</th>
            <th scope="col">high</th>
            <th scope="col">low</th>
            <th scope="col">close</th>
            <th scope="col">volume</th>

        </tr>
        </thead>

        <#list tradeItems as tradeItem>
            <tr>
                <th scope="row">${tradeItem.period}</th>
                <td>${tradeItem.open}</td>
                <td>${tradeItem.high}</td>
                <td>${tradeItem.low}</td>
                <td>${tradeItem.close}</td>
                <td>${tradeItem.volume}</td>
            </tr>
        </#list>
    </table>
</@common.page>