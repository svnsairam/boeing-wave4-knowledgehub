// import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { SearchinfoService } from '../service/searchinfo.service';
// import { Info } from '../domain/info.model';

@Component({
  selector: 'app-searchcard',
  templateUrl: './searchcard.component.html',
  styleUrls: ['./searchcard.component.css']
})
export class SearchcardComponent  {
  title :any;
  info;
  pageLength: number;
  pageSize: 2;
  pageSizeOptions = [2, 4, 6, 8];
  splicedData: any;

  constructor(private search:SearchinfoService ) { }

  ngOnInit() {   
    this.search.getAll().subscribe((data)=>{
      console.log(data);
      this.info=data;
      this.pageLength=this.info.length;
      console.log(this.pageLength);
      this.splicedData=this.info.slice(((0 + 1) - 1) * this.pageSize).slice(0, this.pageSize);
      console.log(this.splicedData)
    console.log("OnInit")});
  }

  pageChangeEvent(event) {
    const offset = ((event.pageIndex + 1) - 1) * event.pageSize;
    this.splicedData = this.info.slice(offset).slice(0, event.pageSize);
  }

}
