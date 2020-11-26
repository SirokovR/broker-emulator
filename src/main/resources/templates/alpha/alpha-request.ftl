<#import  "../common/page.ftl" as common>

<@common.page>

    <form action="/alpha/statistics" method="post">


        <div class="form-group">
            <label for="sticker">Company Sticker</label>
            <input type="text" class="form-control" aria-describedby="stickerHelp" name="sticker">
            <small id="stickerHelp" class="form-text text-muted">Please enter Sticker</small>
        </div>


        <div class="form-group">
            <label for="endDate">End date</label>
            <input type="date" class="form-control" aria-describedby="endDateHelp" name="endDate">
            <small id="endDateHelp" class="form-text text-muted">Please enter date of statistics </small>
        </div>

        <div class="form-group">
            <label for="time-period">Time Period</label>
            <select id="time-period" name="timePeriod" class="form-control">  <#--name нужен что бы Спринг добавил его в класс потом-->
                <option value="TIME_SERIES_DAYLY" selected>Day</option>
                <option value="TIME_SERIES_WEEKLY">Week</option>
                <option value="TIME_SERIES_MONTHLY">Month</option>
                <option value="TIME_SERIES_YEARLY">Year</option>
            </select>
        </div>

        <button type="submit" class="btn btn-primary">Request Statistics</button>
    </form>


</@common.page>