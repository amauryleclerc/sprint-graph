import { Links } from './links';
import { DateUtils } from '../services/date.service';

export class Story {

    static create(object?: any): Story {
        if (object != null) {
            return new Story(object.id,
                object.name,
                object.complexity,
                DateUtils.getDateIfPresent(object.addDate),
                DateUtils.getDateIfPresent(object.closeDate),
                object.businessValue,
                object.type,
                object._links);
        }
        return new Story(null, null, 0, new Date(), null, 0, 'USER_STORY', null);
    }


    constructor(public id: string,
        public name: string,
        public complexity: number,
        public addDate: Date,
        public closeDate: Date,
        public businessValue: number,
        public type: string,
        public _links: Links) {
        if (this.addDate != null) {
            this.addDate.setHours(0, 0, 0, 0);
        }
        if (this.closeDate != null) {
            this.closeDate.setHours(0, 0, 0, 0);
        }
    }



}
