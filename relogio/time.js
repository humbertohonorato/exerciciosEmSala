let currentTime = document.getElementById('currtime');
var timeNow = new Date(0, 0, 0, 10, 0, 0);

function updateTime() {
    let timeNow = new Date(),
        dd = timeNow.getDay() + 1,
        mn = timeNow.getMonth() + 1,
        aa = timeNow.getFullYear(),
        hh = timeNow.getHours(),
        mm = timeNow.getMinutes(),
        ss = timeNow.getSeconds(),
        ms = timeNow.getMilliseconds()

    // Condição ternária (if)
    // condição ? 1ºexpressão : 2ºexpressão
    currentTime.innerHTML = dd + '/' + mn + '/' + aa + '<br>' + setZero(hh) + '<span>:</span>' + (String(mm).length == 1 ? '0' : '') + mm + '<span>:</span>' + (String(ss).length == 1 ? '0' : '') + ss + '<span>:</span>' + ms;

    setTimeout(updateTime);

}

function setZero(value) {
    let _value = '0' + value;
    let _newValue = '';

    for (let i = _value.length - 1; i > _value.length - 3; i--) {
        _newValue = _value[i] + _newValue;
    }
    return _newValue
}

updateTime();
